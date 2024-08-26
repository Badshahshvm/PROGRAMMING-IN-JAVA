public class ThreadC extends Thread{
    public void run()
    {
        System.out.println("I am thread...");
    }

    public static void main(String[] args) {
        ThreadC t=new ThreadC();
        t.start();
    }
}
