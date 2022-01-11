package shop_wait_notify;

public class Buyer extends Thread{

    private Shelf shelf;

    public Buyer (Shelf shelf) {
        this.shelf = shelf;
    }

    @Override
    public void run() {
        while (true){
            shelf.removeJar();
        }
    }
}
