public class diagonal2 {


    public static int diagonalSum(int a[][])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i][i];
            if(i!=a.length-1-i)
            {
                sum=sum+a[i][a.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int a[][]={{12,56},{23,67}};
       int ans= diagonalSum(a);
        System.out.println("sum of diagonal elements "+ans);

    }

}
