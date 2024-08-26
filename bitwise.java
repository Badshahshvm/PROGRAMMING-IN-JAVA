public class bitwise {


    public static void oddOrEven(int n)
    {
        int bit=1;
        if( (n&bit)==0)

        {
            System.out.println("number is even ..");
        }
        else {
            System.out.println("number is odd...");
        }
    }

    public static void main(String[] args)
    {
     oddOrEven(15);
     oddOrEven(18);
    }
}
