package useConcurrentCollection;

public class Woman extends Thread{
    private Fridge fridge;

    public Woman(Fridge fridge) {
        this.fridge = fridge;
    }

    @Override
    public void run() {
        while(true) {
            fridge.removeBottleOfWine();
        }
    }
}
