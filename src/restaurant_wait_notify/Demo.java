package restaurant_wait_notify;

public class Demo {
    /*we have a restaurant. Chefs prepare dish and add it on dishLine.
     Waiters get dishes from dishLine. Capacity of dishLine is 25. */
    public static void main(String[] args) {
        DishLine line = new DishLine();
        Chef chef1 = new Chef(line);
        Chef chef2 = new Chef(line);
        Waiter waiter1 = new Waiter(line);
        Waiter waiter2 = new Waiter(line);
        Waiter waiter3 = new Waiter(line);

        chef1.start();
        chef2.start();
        waiter1.start();
        waiter2.start();
        waiter3.start();
    }
}
