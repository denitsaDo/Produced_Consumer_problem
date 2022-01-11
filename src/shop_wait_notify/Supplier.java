package shop_wait_notify;

public class Supplier extends Thread{

    private Shelf shelf;

    public Supplier(Shelf shelf) {this.shelf = shelf;}

    @Override
    public void run() {
        while (true) {
            shelf.addJar();
        }
    }
}
