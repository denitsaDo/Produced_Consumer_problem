package wineMaking_wait_notify;

import java.util.Random;

public class Gatherer extends Thread{

    private String name;
    private Wagon wagon;

    public Gatherer(String name, Wagon wagon) {
        this.setName(name);
        this.wagon = wagon;
    }

    @Override
    public void run() {
        while (true){
            if(isInterrupted()) {
                break;
            }
            int randKg = new Random().nextInt(3)+1;
            try {
                Thread.sleep(randKg*1000);
            } catch (InterruptedException e) {
                System.out.println("Oops, someone interrupted me");
                break;
            }
            wagon.putGrapesInWagon(randKg);
        }
    }
}
