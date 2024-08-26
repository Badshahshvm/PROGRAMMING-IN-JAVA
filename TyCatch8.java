import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TyCatch8 {
    public static void main(String[] args) {
        System.out.println("1");
        try
        {
            System.out.println(100/0);
            FileInputStream fis=new FileInputStream((""));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("3");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("4");
        }
        System.out.println("5");
    }
}
