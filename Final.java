public class Final {

    int no=10;
}
class Final2 extends Final
{
    int no=20;

    void show(int no)
    {
        System.out.println(no);
        System.out.println(this.no);
        System.out.println(super.no);
    }
    public static void main(String[] args)
    {
        Final2 a=new Final2();
        a.show(40);

    }
}
