import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = x.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j+ " ");

            }
            System.out.println();
        }
    }
}