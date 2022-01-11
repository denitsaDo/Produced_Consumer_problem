package restaurant_wait_notify;

public class Chef extends  Thread{
    private DishLine line;

    public Chef (DishLine line) {this.line = line;}

    @Override
    public void run() {
        while (true) {
            line.addDish();
        }
    }
}
