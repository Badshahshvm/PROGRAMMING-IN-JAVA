public class BinaryString {
    public static String binaryToString(String s)
    {
        int val=Integer.parseInt(s);
        String val2=Integer.toBinaryString(val);
        return val2;
    }
    public static void main(String[] args) {
        System.out.println(binaryToString("15"));
    }
}
