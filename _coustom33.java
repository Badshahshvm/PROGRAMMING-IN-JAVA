package _COUSTOM27;

public class _coustom33 {


    public static void main(String[] args) {

        try
        {
            int a=5;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("we are failed due to this reason:");
            System.out.println(e);
        }
        finally
        {
            System.out.println("completed");
        }

    }

}
