public class GenerateNumberTostring {
    public static String generateInteger(int a[])
    {
        StringBuilder sb=new StringBuilder();
        for(int val:a)
        {
            sb.append(val);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int a[]={1,2,5,7,8};
        System.out.println(generateInteger(a));
    }
}
