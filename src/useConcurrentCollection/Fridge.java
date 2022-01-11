package useConcurrentCollection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Fridge {

    private volatile BlockingQueue <Integer> bottles = new ArrayBlockingQueue<>(17);

    public void addBottleOfWine () {
        try {
            bottles.put(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Man" + Thread.currentThread().getId()+" put a bottle of wine in fridge. Bottles now are: " + bottles.size());
    }

    public void removeBottleOfWine () {
        try {
            bottles.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Woman" + Thread.currentThread().getId()+" took a bottle of wine out of fridge. Bottles now are: " + bottles.size());
    }
}
