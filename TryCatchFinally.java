public class TryCatchFinally
{


    public static void main(String[] args) {
        System.out.println("1");
        try
        {
            System.out.println("2");
        }
        catch(Exception e)
        {
            System.out.println("2");
        }
        finally
        {
            System.out.println("3");
        }
    }
}
