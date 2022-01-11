package bookstore_wait_notify;

public class Distributor extends Thread{

    private WareHouse wareHouse;

    public Distributor(WareHouse wareHouse){this.wareHouse = wareHouse;}

    @Override
    public void run() {
        while (true) {
            wareHouse.distributeBook();
        }
    }
}
