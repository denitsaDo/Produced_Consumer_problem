package wineMaking_wait_notify;

public class Wagon {

    private volatile int grapesKG= 0;

    protected synchronized void putGrapesInWagon (int grapes) {
        try {
            while(grapesKG + grapes > 60) {
                  wait();
            }
            this.grapesKG+=grapes;
            System.out.println(Thread.currentThread().getName() + " put in wagon "+ grapes +" kg grapes. Grapes in wagon now are: " + grapesKG);
            if (grapesKG >=10) {
                notifyAll();
            }
        } catch (InterruptedException e) {
            System.out.println("ehhhhhh mamo");
            Thread.currentThread().interrupt();
        }
    }

    protected synchronized void getOutGrapesFromWagon () {
        try {
            while (grapesKG < 10) {
                wait();
            }
            grapesKG-=10;
            System.out.println(Thread.currentThread().getName() + " get out of wagon 10 kg grapes.Grapes in wagon now are: " + grapesKG);
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println("Problem in wagon");
        }
    }
}
