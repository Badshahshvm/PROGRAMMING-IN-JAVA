import java.sql.SQLOutput;
import java.util.Scanner;

public class algo {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);

        int i,m,n,p;

        System.out.println("enter the size of array:");
        n=x.nextInt();
        int []a = new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        System.out.println(a.length);
        System.out.println("enter the index:");
        m=x.nextInt();
        System.out.println("enter the value");
        p=x.nextInt();
        int [] b=new int[n+1];

        for(i=0;i<n+1;i++)
        {
            if(i<m)
            {
                b[i]=a[i];
            }
            else if(i==m)
            {
                b[i]=p;
            }
            else {
                b[i]=a[i-1];

            }
        }
        for(i=0;i<n+1;i++)
        {
            System.out.println(b[i]);
        }

    }
}
