
interface Camera
{
    void clickPhoto();
    void recordVideo();
    default void record4kVideo()
    {
        System.out.println("yes..this camera can be record 4k video");
    }
}
interface MediaPlayer
{
    void listenMusic();
    void watchVideo();
}
class Cellphone implements MediaPlayer, Camera
{
    public void phoneNumber()
    {
        System.out.println("conecting\ndeclined");
    }
    public void pickUpCall()
    {
        System.out.println("connecting......");
    }
    public void denyCall()
    {
        System.out.println("declinned......");
    }
    public void clickPhoto()
    {
        System.out.println("clear and beautiful");
    }
    public void watchVideo()
    {
        System.out.println("Youtube, Netflix, Amazonprime");
    }
    public void listenMusic()
    {
        System.out.println("hindi, english, chinese:");
    }
    public void recordVideo()
    {
        System.out.println("highlighted and blur");
    }
}
public class _coustom18 {
    public static void main(String[] args)
    {
        Cellphone nokia=new Cellphone();
        nokia.pickUpCall();
        nokia.listenMusic();
        nokia.watchVideo();
        nokia.clickPhoto();
        nokia.recordVideo();
        nokia.record4kVideo();
    }
}
