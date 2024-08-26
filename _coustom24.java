interface remote {
    void soundUp(int x);

    void soundDown(int y);

}
            interface Tvremote extends remote
            {
                void changeChannel();
                void menu();
          }
          class Tv implements Tvremote
          {
    public void startTv()
    {
        System.out.println("press on button");

    }
    public void soundUp(int x)
    {
        System.out.println("press up button and volume becomes high:");
    }
    public void soundDown(int y)
    {
        System.out.println("press own button, volume becomes low...");
    }
    public void changeChannel()
    {
        System.out.println("Tv channel change accourding to viewer mood");
    }
    public void menu()
    {
        System.out.println("go to the menue butto...and connect to the wifi...");
    }
          }

public class _coustom24 {
    public static void main(String[] args)
    {
        Tv samsung=new Tv();
        samsung.soundUp(7);
        samsung.menu();
        samsung.changeChannel();
        samsung.startTv();
    }



}
