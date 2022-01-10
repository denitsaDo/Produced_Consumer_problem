package digitalPhotoFrame;

public class Mother extends Thread{

    private DigitalPhotoFrame frame;

    public Mother (DigitalPhotoFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        while (true) {
            try {
                frame.addPicture();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
