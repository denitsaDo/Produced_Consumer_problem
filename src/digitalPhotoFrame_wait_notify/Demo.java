package digitalPhotoFrame_wait_notify;

public class Demo {
    /*We have digital photo frame which stores up to 150 pictures.
    * Mother adds pictures
    * Father deletes pictures*/
    public static void main(String[] args) {
        DigitalPhotoFrame frame = new DigitalPhotoFrame();
        Father papa = new Father(frame);
        Mother mama = new Mother(frame);

        mama.start();
        papa.start();

    }
}
