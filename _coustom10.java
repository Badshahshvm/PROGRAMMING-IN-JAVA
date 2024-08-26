import java.util.Base64;

class Base
{
    int x;
    Base()
        {
            System.out.println("This is base constructor:");
        }
        Base(int a)
        {
            System.out.println("I am overloaded constructor"+ a);
        }
        public void setBase(int n)
        {
            x=n;
        }
        public int getX()
        {
            return x;
        }
}
class Derived extends Base {
    Derived() {
        super(10);
        System.out.println("This is dervived class constructor");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I M VERY FAST" + y);
    }
}
    class Child extends Derived{
        Child(int x, int y, int z)
        { super(x,y);
            System.out.println("I m bcahha");

        }

    }

public class _coustom10 {
    public static void main(String[] args)
    {
       // Base base = new Base();
        Derived d=new Derived(14,9);
        Child c=new Child(4,6,8);
    }
}
