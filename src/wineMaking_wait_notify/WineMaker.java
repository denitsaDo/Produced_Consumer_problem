package wineMaking_wait_notify;

import java.util.Random;

public class WineMaker extends Thread{

    private String name;
    private Wagon wagon;
    private Winery winary;

    public WineMaker(String name, Wagon wagon, Winery winery) {
        this.setName(name);
        this.wagon = wagon;
        this.winary = winery;
    }

    @Override
    public void run() {
        while (true) {
            wagon.getOutGrapesFromWagon();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            winary.putBottleInWinery();
        }
    }
}
