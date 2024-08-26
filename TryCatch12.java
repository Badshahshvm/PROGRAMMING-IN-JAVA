import java.io.FileInputStream;

public class TryCatch12 {
    public static void main(String[] args)
    {
        FileInputStream fis=null;
        try
        {
            fis=new FileInputStream(" ");
            fis.read();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
