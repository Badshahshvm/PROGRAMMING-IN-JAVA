interface math
{
    void method1(int x,int y);
    void method2(int x,int y);
}
interface sub extends  math
{
    void english();
    void science();

}
class Vidyarthi implements  sub
{
   public  void method1(int x,int y)
    {
        int sum=x+y;
        System.out.println(sum);
    }
   public  void method2(int x,int y)
    {
        if(x>y)
        {
            int sub=x-y;
            System.out.println(sub);
        }
        else {
            int sub = y - x;
            System.out.println(sub);
        }

    }
    public void english()
    {
        System.out.println("sylaabus cmpleted");
    }
    public void science()
    {
        System.out.println("not completed:");
    }
}


public class _coustom19 {
    public static void main(String[] args) {
        Vidyarthi s1=new Vidyarthi();
        s1.method1(7,9);
        s1.method2(56,89);
        s1.english();
        s1.science();

    }
}
