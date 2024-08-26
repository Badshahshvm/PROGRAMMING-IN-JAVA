import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DynamicStream {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis=new FileInputStream("D:\\extra\\VikashBirthday.java");
            FileOutputStream fos=new FileOutputStream("vikash.txt");
            int i;
            while((i=fis.read())!=-1)
            {
                fos.write(i);
            }

        }
        catch(Exception e)
        {

        }
    }
}
