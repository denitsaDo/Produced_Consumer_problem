package bookstore_wait_notify;

public class WareHouse {

    private volatile int books = 0;

    public synchronized void distributeBook() {
        while (books >= 180) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        books++;
        notifyAll();
        System.out.println("Distributor" + Thread.currentThread().getId() + " just distributed a book to the Bookstore. Books in warehouse are: " + books);
    }
    public synchronized void buyBook() {
        while (books <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        books--;
        notifyAll();
        System.out.println("Buyer" + Thread.currentThread().getId() + " just bought a book of the Bookstore. Books in warehouse are: " + books);
    }
}
