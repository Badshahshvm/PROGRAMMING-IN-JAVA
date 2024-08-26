import java.util.Scanner;

public class count {
    public static int countSet(int n)
    {
        int count = 0;
        while(n>0) {

        if ((n & 1) != 0) {
            count++;
        }
        n = n >> 1;
    }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number:- ");
        int n=x.nextInt();
        System.out.println(countSet(n));
    }

}
