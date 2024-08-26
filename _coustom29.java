package _COUSTOM27;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

class MyCollage extends Thread{
    public void run()
    { int i=0;
        for(i=0;i<20;i++)

        System.out.println("students are not eligible....");
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class MySchool extends Thread{
    public void run()
    {
        System.out.println("all students are eleigible for this...event...");
    }
}

public class _coustom29 {
    public static void main(String[] args) {
        MyCollage s1=new MyCollage();
        s1.start();
        MySchool s2=new MySchool();
        s2.start();

    }
}
