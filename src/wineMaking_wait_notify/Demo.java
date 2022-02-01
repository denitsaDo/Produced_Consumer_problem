package wineMaking_wait_notify;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

        Wagon wagon = new Wagon();
        Winery winery = new Winery();
        ArrayList<Gatherer> berachi = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            berachi.add(new Gatherer("Gatherer"+(i+1), wagon));
        }
        berachi.forEach(gatherer -> gatherer.start());

        for (int i = 0; i < 2; i++) {
            Thread maker = new WineMaker("WineMaker"+ (i+1), wagon,winery);
            maker.start();
        }

        DrunkMaster drinker = new DrunkMaster(winery);
        drinker.start();


        Thread.sleep(2*60*1000);   // 2min x 60 sec x 1000mills

        System.out.println("*************************** Gathering is over ***************************");
        berachi.forEach(g->g.interrupt());

    }
}
