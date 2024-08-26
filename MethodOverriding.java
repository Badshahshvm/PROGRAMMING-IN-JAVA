class A
{
    void show()
    {
        System.out.println("This iss A");
    }
}
class B extends A{
    void show()
    {
        System.out.println("This iss B");
    }

        }




public class MethodOverriding
{

    public static void main(String[] args)
    {
        A a1=new A();
        a1.show(); // This is A
        B b1=new B();
        b1.show(); //This is B
        A b2=new B();
        b2.show();
        

    }

}
