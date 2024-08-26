
class ThreadMy extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        System.out.println("child Thread 2");
    }
}
public class Thread2
{
    public static void main(String[] args) {
        ThreadMy tm=new ThreadMy();
        tm.start();
        for(int i=0;i<100;i++)
        {
            System.out.println("main thread");
        }
    }
}
