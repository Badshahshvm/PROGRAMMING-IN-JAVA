import java.util.Scanner;

public class traget {
    public static int sumTarget(int n[], int target)
    {
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]+n[j]==target)
                {
                    System.out.println("{"+ i+","+ j+"}");
                }
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int n[]={1,2,7,89,12};
        Scanner x=new Scanner(System.in);
        System.out.println("enter the target");
        int target=x.nextInt();
        System.out.println(sumTarget(n,target));
    }
}

