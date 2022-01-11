package bookstore_wait_notify;

public class Reader extends  Thread{

    private WareHouse wareHouse;

    public Reader(WareHouse wareHouse) {this.wareHouse = wareHouse;}

    @Override
    public void run() {
        while (true) {
            wareHouse.buyBook();
        }
    }
}
