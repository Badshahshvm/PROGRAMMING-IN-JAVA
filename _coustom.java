class Samrtphone{
    int ip;
    String brand;
    int price;
    String color;
}
public class _coustom {
    public static void main(String[] args)
    {
        System.out.println("***properties of smartphone***");
        Samrtphone s1=new Samrtphone();
        s1.ip=34567;
        s1.brand="Apple";
        s1.price=100000;
        s1.color="blue";
        System.out.println(s1.brand);
        System.out.println(s1.price);
        System.out.println(s1.color);
        System.out.println(s1.ip);
        Samrtphone s2=new Samrtphone();
        s2.brand="Oppo";
        s2.ip=987654;
        s2.price=30000;
        s2.color="brighter";
        System.out.println(s2.brand);
        System.out.println(s2.ip);
        System.out.println(s2.price);
        System.out.println(s2.color);

    }
}
