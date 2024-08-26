public class method9 {
    public static void reverse(int n) {
        int r, rev = 0;
        while (n > 0) {

            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;


        }
        System.out.println(rev);
    }
        public static void main (String[]args)
        {
            reverse(234);
        }
    }

