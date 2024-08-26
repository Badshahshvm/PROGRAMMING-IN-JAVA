import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n,i,m;
        System.out.println("enter the sze of array");
        n=x.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        System.out.println("enter the index:");
        m=x.nextInt();
        int [ ] b=new int[n-1];
        for(i=0;i<a.length;i++)
        {
            if(i<m)
            { b[i]=a[i];

        }
            else if(i==m)
            {
                continue;
            }
            else {
                b[i-1]=a[i];
            }
        }
        for(i=0;i<n-1;i++)
        {
            System.out.println(b[i]);
        }
    }
}
