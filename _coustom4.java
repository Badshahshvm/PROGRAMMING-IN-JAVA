import javax.naming.Name;

class Coustomer{
    int Discount;
    String Name;
    public String getName()
    {
        return Name;
    }

    public void setName(String n)
    {
        Name=n;
    }
    public int getDiscount()
    {
        return Discount;
    }
    public void setDiscount(int d)
    {
        Discount=d;
    }

}
public class _coustom4 {
    public static void main(String[] args)
    {
        Coustomer c1=new Coustomer();
        c1.setName("SHIVAM");
        System.out.println(c1.getName());
        c1.setDiscount(500);
        System.out.println(c1.getDiscount());
        Coustomer c2=new Coustomer();
        c2.setName("Shivmangal raj");
        System.out.println(c2.getName());
        c2.setDiscount(900);
        System.out.println(c2.getDiscount());
        Coustomer c3=new Coustomer();
        c3.setName("Armaan");
        System.out.println(c3.getName());
        c3.setDiscount(600);
        System.out.println(c3.getDiscount());
        Coustomer c4=new Coustomer();
        c4.setName("aayush");
        System.out.println(c4.getName());
        c4.setDiscount(100);
        System.out.println(c4.getDiscount());



    }
}
