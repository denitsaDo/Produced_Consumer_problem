package restaurant;

public class Chef extends  Thread{
    private DishLine line;

    public Chef (DishLine line) {this.line = line;}

    @Override
    public void run() {
        while (true) {
            try {

                line.addDish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
