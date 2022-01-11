package restaurant_wait_notify;

public class Waiter extends Thread{

    private DishLine line;
    public Waiter (DishLine line) {this.line = line;}

    @Override
    public void run() {
        while(true) {
            line.getDish();
        }
    }
}

