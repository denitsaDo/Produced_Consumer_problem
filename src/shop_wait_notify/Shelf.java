package shop_wait_notify;

public class Shelf {

    private volatile int jars = 0;
    private static final int MAX_CAPACITY = 33;
    private static final int MIN_CAPACITY = 0;

    public synchronized void addJar() {
        while (jars >= MAX_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        jars++;
        notifyAll();
        System.out.println("Supplier" + Thread.currentThread().getId()+ " just delivered a new jar. Total jars are: " + jars);
    }

    public synchronized void removeJar() {
        while (jars <= MIN_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        jars--;
        notifyAll();
        System.out.println("Buyer" + Thread.currentThread().getId()+ " just bought a new jar. Total jars are: " + jars);
    }

}
