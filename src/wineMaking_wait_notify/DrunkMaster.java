package wineMaking_wait_notify;

public class DrunkMaster extends Thread{

    private Winery winery;
    private String name;

    public DrunkMaster(Winery winery) {
        this.winery = winery;
        this.name = "DrinkingMan";
    }

    @Override
    public void run() {
        while (true){
            winery.getBottleOUTofWinery();

        }
    }
}

