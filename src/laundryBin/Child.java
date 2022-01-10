package laundryBin;

public class Child extends Thread{

    private LaundryBin bin;

    Child (LaundryBin bin) {
        this.bin = bin;
    }

    @Override
    public void run() {
        while (true) {
            try {
                bin.addClothesToBin();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
