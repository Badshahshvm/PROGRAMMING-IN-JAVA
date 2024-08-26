public class TryCatch4
{
    public static void main(String[] args)
    {
        System.out.println("1");
        try
        {
            System.out.println("2");
            System.out.println(100/0);
        }
        catch(IndexOutOfBoundsException e)

              //  this gives runTime Exception:-
        {
            System.out.println(e);
        }
        System.out.println("4");
    }


}
