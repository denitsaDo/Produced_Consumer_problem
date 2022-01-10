package laundryBin;

public class Mother extends Thread{

    private LaundryBin bin;
    Mother(LaundryBin bin) {
        this.bin = bin;
    }

    @Override
    public void run() {
        while (true) {
            try {
                bin.getClothesOutOfBin();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
