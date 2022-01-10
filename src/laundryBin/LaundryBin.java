package laundryBin;

public class LaundryBin {
    private volatile int clothes = 0;  // should I have volatile?

    public synchronized void addClothesToBin() throws InterruptedException {
        while (clothes >= 40) {
            wait();
        }
        clothes++;
        notifyAll();
        System.out.println("Thread No:"+Child.currentThread().getId()+ " Just added clothes. Clothes in LaundryBin are: " + clothes );
    }
    public synchronized void getClothesOutOfBin() throws InterruptedException {
        while (clothes <= 0) {
            wait();
        }
        clothes--;
        notifyAll();
        System.out.println("Just removed clothes. Clothes in LaundryBin are: " + clothes );
     }
}
