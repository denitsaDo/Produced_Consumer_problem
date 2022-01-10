package digitalPhotoFrame;

public class DigitalPhotoFrame {

    private volatile int pictures = 0;
    private static final int MAX_PICTURES = 150;
    private static final int MIN_PICTURES = 0;

    public synchronized void addPicture () throws InterruptedException {
        while (pictures >= MAX_PICTURES) {
            wait();
        }
        pictures++;
        notifyAll();
        System.out.println("Mother added a picture. Pictures now are: " + pictures);
    }

    public synchronized void removePicture() throws InterruptedException {
        while (pictures <= MIN_PICTURES) {
            wait();
        }
        pictures--;
        notifyAll();
        System.out.println("Father removed a picture. Pictures now are: " + pictures);

    }
}
