import java.util.Scanner;

public class _method {
    static void tellJoke()
    {  int i;
        for(i=0;i<5;i++)
        System.out.println("Iam the very smart boy ");
        for(i=1;i<=10;i++)
            System.out.println("++++++++++");
    }

static void sum()
{
    Scanner num=new Scanner(System.in);
    System.out.println("enter the first number");
    int a=num.nextInt();
    System.out.println("enter the second number:");
    int b=num.nextInt();
    int sum=a+b;
    System.out.println(sum);

}
static void sub()
{
    Scanner num=new Scanner(System.in);
    System.out.println("enter the first number");
    int a=num.nextInt();
    System.out.println("enter the second number");
    int b=num.nextInt();
    int sub;
    if(a>b)
    {
        sub=a-b;
        System.out.println(sub);
    }
    else
    {
        sub=b-a;
        System.out.println(sub);
    }
}
static void mul()
{
    Scanner num=new Scanner(System.in);
    System.out.println("enter the first number");
    int a=num.nextInt();
    System.out.println("enter the second number");
    int b=num.nextInt();
    int x;
    x=a*b;
    System.out.println(x);
}
static void change(int [] a)
{
    a[0]=98;
}

    public static void main(String[] args)
    {
        tellJoke();
        sum();
        sub();
        mul();
        int [] marks={45,78,56,43,21};
        change(marks);
        System.out.println("the value ");
    }
}
