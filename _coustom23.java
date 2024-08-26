abstract class Telephone
{
    abstract void ring();
    abstract void disConnected();
    abstract void connected();
}
class Smartphone extends Telephone {
    public void ring()
    {
        System.out.println(" get notification");
    }
 public void disConnected()
 {
     System.out.println("when Smartphone is swiched off");
    }
    public void connected()
    {
        System.out.println("when Smartphone is on...");
    }
}
public class _coustom23
{
    public static void main(String[] args) {
        Telephone t1=new Smartphone();
        t1.ring();
        t1.disConnected();
        t1.connected();

    }
}
