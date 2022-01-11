package restaurant;

public class Waiter extends Thread{

    private DishLine line;
    public Waiter (DishLine line) {this.line = line;}

    @Override
    public void run() {
        while(true) {
            try {
                line.getDish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

