package restaurant;

public class DishLine {

    private volatile int dishes = 0;
    private static final int MAX_DISHES = 25;
    private static final int MIN_DISHES = 0;

    public synchronized void addDish() {
        while (dishes >= MAX_DISHES) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dishes++;
        notifyAll();
        System.out.println("Chef" + Thread.currentThread().getId() + " just prepared a dish. Total dishes are: " + dishes);
    }
    public synchronized void getDish() {
        while (dishes <= MIN_DISHES) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dishes--;
        notifyAll();
        System.out.println("Waiter" + Thread.currentThread().getId()+ " just carried away a dish. Total dishesh are: " + dishes);
    }
}
