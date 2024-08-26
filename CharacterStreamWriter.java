import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamWriter {
    public static void main(String[] args) {
        try
        {
            String s="This is written by you...";
            FileWriter fw=new FileWriter("D:\\extra\\DEMO.txt", true);
            fw.write(s);
            fw.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
