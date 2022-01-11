package useConcurrentCollection;

public class Demo {
    public static void main(String[] args) {
    /*We have men and women who put and take a bottle of wine in a refrigerator with capacity of 17 bottles.
    * We will use a blocking queue instead of wait-notify-mechanism */

        Fridge fridge = new Fridge();
        Man man1 = new Man(fridge);
        Man man2 = new Man(fridge);
        Woman w1 = new Woman(fridge);
        Woman w2 = new Woman(fridge);
        Woman w3 = new Woman(fridge);

        man1.start();
        man2.start();
        w1.start();
        w2.start();
        w3.start();
    }
}
