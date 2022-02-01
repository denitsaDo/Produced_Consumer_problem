package wineMaking_wait_notify;

public class Winery {

    private volatile int wineBottles=0;


    protected synchronized void putBottleInWinery() {
        try {
            while (wineBottles >= 100) {
                wait();
            }
            this.wineBottles += 1;
            System.out.println(Thread.currentThread().getName() + " added 1 bottle in winery. Bottles in winery are: " + wineBottles);
            if (wineBottles >= 10) { //if there is enough bottles, wake up DrunkMaster
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected synchronized void getBottleOUTofWinery(){
        try {
            while (wineBottles < 10) {
                wait();
            }
            wineBottles -= 10;
            System.out.println(Thread.currentThread().getName() + " just drank ******10****** bottles. Bottles in winery are: " + wineBottles);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
