package bookstore_wait_notify;

public class Demo {
    public static void main(String[] args) {


        WareHouse bookStoreWarehouse = new WareHouse();

        Distributor dis1 = new Distributor(bookStoreWarehouse);
        Distributor dis2 = new Distributor(bookStoreWarehouse);

        Reader reader1 = new Reader(bookStoreWarehouse);
        Reader reader2 = new Reader(bookStoreWarehouse);
        Reader reader3 = new Reader(bookStoreWarehouse);
        Reader reader4 = new Reader(bookStoreWarehouse);

        dis1.start();
        dis2.start();
        reader1.start();
        reader2.start();
        reader3.start();
        reader4.start();
    }
}
