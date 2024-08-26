import java.util.Scanner;

public class askname {
    public static void main(String[] args) {
        System.out.print("hello ");
        Scanner ask=new Scanner(System.in);
        String ch=ask.nextLine();
        System.out.println(ch);
        System.out.println("hello "+ ch +"how may i help you");
    }
}
