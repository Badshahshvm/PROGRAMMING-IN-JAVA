abstract class Parent
{
    Parent()
    {

    }
    void child()
    {
        System.out.println("My parents are very protective............");
    }
    abstract void care();
}



 class Abstraction extends Parent
{
   Abstraction()
   {
       super();
   }
    void care()
    {
        System.out.println("Our family ar very caring...");
    }
}
class Osm
{
    public static void main(String[]args)
    {
        Abstraction a1=new Abstraction();
       a1.child();
       a1.care();
    }
}

