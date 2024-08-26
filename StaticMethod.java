public class StaticMethod {
    void show()
    {
        System.out.println("I am shivam");
    }
    static void show2()
    {
        System.out.println("I am Bigboss");
    }
    public static void main(String[] args)
    {
        StaticMethod s1=new StaticMethod();
        s1.show();
        StaticMethod.show2();
        show2();
    }
}
