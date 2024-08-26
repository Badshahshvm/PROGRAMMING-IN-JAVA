import java.util.Scanner;

public class _2D {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int i,j,n,m;
        System.out.println("enter th no of row");
        n=x.nextInt();
        System.out.println("enter the column");
        m=x.nextInt();
        int [][]a=new int [m][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=x.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
