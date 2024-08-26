import org.w3c.dom.ls.LSOutput;

class MyThread extends Thread{
   @Override
    public void run()


    {
        int i=0;
        while(i<90)
    {
        System.out.println("this thread is running");
        System.out.println("I am happy!");
    i++;
    }

    }
}
class MyThread1 extends Thread{
    @Override
    public void run()
    { int i=0;
        while(i<90)
        {
            System.out.println("this is thread 2 running:");
            System.out.println("I am very excited:");
            i++;
        }
    }
}


public class _coustom26 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        MyThread1 t1=new MyThread1();
        t1.start();
        t.start();
    }
}
