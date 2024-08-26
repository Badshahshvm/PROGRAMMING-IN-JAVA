import java.util.Scanner;

public class diagonal {
    public static int diagonalSum(int a[][])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(i==j)
                {
                    sum=sum+a[i][j];
                }
                else if(i+j==a.length-1)
                {
                    sum=sum=sum+a[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        int a[][]={{12,45,67},{56,89,10},{19,67,44}};
        int ans=diagonalSum(a);
        System.out.println("sum of diagonal elements is "+ans);

    }
}
