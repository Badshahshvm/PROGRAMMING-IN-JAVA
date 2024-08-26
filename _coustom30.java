import java.util.Scanner;

public class _coustom30 {
    public static void main(String[] args) {
        //syntax error:-
        //int i=100
        //logical error:
        System.out.println(2);
        for(int i=1;i<5;i++)
        {
            System.out.println(2*i+1);
        }
        int k;
        Scanner x=new Scanner(System.in);
        k=x.nextInt();
        System.out.println("the user input is divisible of 1000 "+ 1000/k);
    }

}
