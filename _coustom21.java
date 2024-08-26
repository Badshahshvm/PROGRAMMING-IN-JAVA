import java.security.PublicKey;

abstract class Pen{
    abstract void write();
    abstract void refill();


        }
        class Agni extends Pen
        {
   public void write()
        {
            System.out.println("write something on paper:");
        }
        public void refill()
        {
            System.out.println("after finishing of lid ...refill lid inti pen");
        }
        public void work()
        {
            System.out.println("finifhed wrriting");
        }
        }


public class _coustom21 {
    public static void main(String[] args) {
        Agni a1=new Agni();
        a1.write();
        a1.refill();
        a1.work();
    }
}
