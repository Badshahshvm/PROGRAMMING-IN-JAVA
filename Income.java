import java.util.Scanner;

public class Income {
    public static void main(String[] args)
    {
        Scanner workers=new Scanner(System.in);
        System.out.println("payscale of worker");
        float payscale=workers.nextFloat(); //payscale in lakh
        if(payscale>2.5f && payscale<5.0)
        {
            System.out.println("tax=5%");
        } else if (payscale>5.0 && payscale<10.0)
        {
            System.out.println("tax=20%");

        }
        else if(payscale>10.0)
        {
            System.out.println("tax=30%");
        }

    }
}
