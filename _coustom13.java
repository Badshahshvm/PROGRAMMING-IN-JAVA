class Phone{
    public void on()
    {
        System.out.println("ringing");
    }
    public void name()
    {
        System.out.println("apple");
    }
}
class Mobile extends Phone
        {
            public void off()
            {
                System.out.println("vibrating");
            }
            public void name()
            {
                System.out.println("oppo");
            }


        }
public class _coustom13 {
    public static void main(String[] args)
    {
        Phone obj=new Mobile();
        obj.on();
        obj.name();

    }
}
