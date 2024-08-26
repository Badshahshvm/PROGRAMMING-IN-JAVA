interface Transport
{
    public abstract void start();
   public abstract void gears();

}
class Caar implements Transport
{
    String name;
    Caar(String s1)
    {
        name=s1;
    }
    public void start()
    {
        System.out.println("Start with key...");
    }
   public  void gears()
    {
        System.out.println("no idea...");
    }
}
class Bus implements Transport
{
    int p;
    Bus(int  s1)
    {
        p=s1;
    }
    public void start()
    {
        System.out.println("Start with key...");
    }
    public  void gears()
    {
        System.out.println("4");
    }
}

public class InterfaceOOP {
   public static void main(String[] args)
   {
       Caar c1=new Caar("Scorpio");
       c1.start();
       c1.gears();
       Bus s1=new Bus(10000000);
       s1.start();
       s1.gears();
   }

}
