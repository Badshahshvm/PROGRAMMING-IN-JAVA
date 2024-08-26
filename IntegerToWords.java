public class IntegerToWords {
    public static int countLengthOfNum(int n)
    {
        int r=0;
        int count=0;
        while(n>0)
        {
            r=n%10;
            count++;
            n=n/10;

            
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countLengthOfNum(555));
    }
}
