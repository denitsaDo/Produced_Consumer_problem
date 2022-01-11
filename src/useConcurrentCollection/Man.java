package useConcurrentCollection;

import java.util.concurrent.BlockingQueue;

public class Man extends Thread{

    private Fridge fridge;

    public Man (Fridge fridge) {this.fridge = fridge;}

    @Override
    public void run() {
        while (true) {
            fridge.addBottleOfWine();
        }
    }
}
