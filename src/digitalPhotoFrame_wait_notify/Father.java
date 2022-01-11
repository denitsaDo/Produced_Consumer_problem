package digitalPhotoFrame_wait_notify;

public class Father extends Thread{

    private DigitalPhotoFrame frame;

    public Father(DigitalPhotoFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        while (true) {
            try {
                frame.removePicture();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
