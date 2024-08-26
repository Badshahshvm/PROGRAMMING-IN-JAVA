package _COUSTOM27;

class MyCompany extends Thread{
     public void run()
     {

         System.out.println("happy");
     }
}
class MyCompany1 extends Thread{
    @Override
    public void run() {
        int i=0;
        for(i=0;i<55;i++)
        {
            System.out.println("we can survive with this...");
        }
    }
}
public class _coustom28 {
    public static void main(String[] args) {
        MyCompany e1=new MyCompany();
        e1.start();
        try
        {
            e1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        MyCompany1 e2=new MyCompany1();
        e2.start();
    }
}
