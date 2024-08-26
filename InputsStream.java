import java.io.FileInputStream;

public class InputsStream {

    public static void main(String[] args) {
        try
        {
            FileInputStream f=new FileInputStream("D:\\extra\\VikashBirthday.java");
            int i=f.read();
            while((i=f.read())!=-1) {
                System.out.println((char) i);
            }
            f.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }

}
