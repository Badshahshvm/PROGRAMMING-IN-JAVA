public class array8 {
    public static void maxSub(int n[]) {
        int start, end;
        int current = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            start = i;
            for (int j = i; j < n.length; j++) {
                end = j;
                current=0;
                for (int k = start; k <= end; k++) {
                    current = current + n[k];
                }
                System.out.println(current);
                if (max > current) {
                    max = current;
                }
            }


        }
        System.out.println(max);
    }
    public static void main(String[] args)
    {
        int n[]={4,6,8,9,10};
        maxSub(n);
    }
}
