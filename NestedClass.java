class Outer
{
    void show()
    {
        System.out.println("I am in outer class");
    }
    class Inner
    {
        void Display()
        {
            System.out.println("I ma in Inner class");
        }
    }
}
public class NestedClass {
    public static void main(String[] args)
    {
        Outer a1=new Outer();
        a1.show();
        Outer.Inner b1=a1.new Inner();
        b1.Display();
    }
}
