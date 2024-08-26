import java.io.FileOutputStream;

public class outPutStream {
    public static void main(String[] args) {
        String d="Ths is my first demo...";
        try
        {
            FileOutputStream fos=new FileOutputStream("bbb.txt");
            byte[] b=d.getBytes();
            fos.write(b);
            fos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
