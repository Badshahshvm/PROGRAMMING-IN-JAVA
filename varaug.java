public class varaug {
    static int sum(int ...arr)
    {
        int result=0;
        for(int a:arr)
        {
            result=result+a;

        }
       return result;
    }

    public static void main(String[] args) {
        System.out.printf("sum of a and b is=%d\n", sum(4,5));
        System.out.printf("sum of a,b,c is=%d\n", sum(4,5,6));
        System.out.printf("sum of a, b,c,d is=%d\n", sum(4,5,9,7));
        System.out.printf("sum of a,b,c,d,e is=%d\n", sum(4,5,4,6,5));
        System.out.printf("sum of a,b,c,d,e,f is=%d\n", sum(4,5,1,2,3,5));
    }
}
