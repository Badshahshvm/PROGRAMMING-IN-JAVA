import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("enter marks");
        Scanner subject=new Scanner(System.in);
        System.out.println("enetr maths marks");
        float m=subject.nextFloat();
        System.out.println("enetr science marks");
        float s=subject.nextFloat();
        System.out.println("enetr s.st marks");
        float t=subject.nextFloat();
        System.out.println("enetr english marks");
        float e=subject.nextFloat();
        System.out.println("enetr sanskrit marks");
        float h=subject.nextFloat();
        float sum=m+s+t+e+h;
        float avg=(sum/500)*100;
        System.out.println(avg);
    }
}
