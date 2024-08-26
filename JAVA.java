package _COUSTOM27;

import java.security.spec.MGF1ParameterSpec;

class MyThread extends Thread
        {   public MyThread(String name)
        {
            super(name);
        }
            public void run()
            {
                int i=0;
                for(i=0;i<5;i++)
                {
                    System.out.println("this is thread");
                }
            }

        }

public class JAVA {
    public static void main(String[] args) {
        MyThread m1=new MyThread("SHIVA");
        MyThread m2=new MyThread("VIKASH");
        m1.start();
        m2.start();
        System.out.println("id of m1 is "+  m1.getId());
        System.out.println("the name of MyThread is "+ m1.getName());
        System.out.println("the class of MyThread is "+ m1.getClass());
        System.out.println("the priority of MyThread is  "+ m1.getPriority());
        System.out.println("id of MyThread  is "+  m2.getId());
        System.out.println("the name of MyThread is "+ m2.getName());
        System.out.println("the class of MyThread is "+ m2.getClass());
        System.out.println("the priority of MyThread is  "+ m2.getPriority());

    }
}
