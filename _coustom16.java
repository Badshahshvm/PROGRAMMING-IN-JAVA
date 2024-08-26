 abstract class Base3
{
   public Base3() {
       System.out.println("I m constructor");  //contructor

    }
    public void sayHello()
    {
        System.out.println("hello!");
    }
    abstract public void greet();
}
 abstract class Base4 extends Base3 {
    public void greet()
    {
        System.out.println("good morning");
    }

}
class Base5 extends Base4{
    public Base5()
    {
        System.out.println("nothing new");
    }
    public void greet()
    {
        System.out.println("good evening");
    }
}
public class _coustom16 {
    public static void main(String[] args)
    {
        Base5 b2=new Base5();
        b2.greet();
    }
}
