package shop_wait_notify;

public class Demo {

    public static void main(String[] args) {

        Shelf shopShelf = new Shelf();
        Buyer b1 = new Buyer(shopShelf);
        Buyer b2 = new Buyer(shopShelf);

        Supplier s1 = new Supplier(shopShelf);
        Supplier s2 = new Supplier(shopShelf);
        Supplier s3 = new Supplier(shopShelf);

        b1.start();
        b2.start();
        s1.start();
        s2.start();
        s3.start();

    }
}
