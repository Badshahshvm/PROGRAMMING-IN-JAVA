public class TryCatch10
{
    public static void main(String[] args) {
        System.out.println("1");
        try
        {
            System.out.println("2");
            System.out.println(100/0);
        }
        catch( Exception e)
        {
            System.out.println("3");
        }
        catch(Throwable e)
        {
            System.out.println("5");
        }
        System.out.println("4");
    }
}
