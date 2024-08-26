import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
        try
        {
            FileReader fr=new FileReader("D:\\extra\\Animal.class\\");
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.println((char)i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
