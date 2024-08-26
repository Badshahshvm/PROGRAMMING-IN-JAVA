import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number");
        int n = num.nextInt();
        int i = 1, j = 100;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(j);
            j--;

        }
        while (j >= 1);
    }
}
