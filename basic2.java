public class basic2 {


    public static void remoove(int a[])
    {
        int n=a.length;
        int temp[]=new int[n];
        int copy[]=new int[n];
        int t=0;
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                temp[j++] = a[i];
            }
            else {
            copy[t++]=a[i];
            }

        }
        temp[j++]=a[n-1];
        copy[t++]=a[n-1];
        for(int k=0;k<j;k++)
        {
            System.out.print(temp[k]+" ");
        }
        System.out.println();
        for(int x=0;x<t;x++)
        {
            System.out.print(copy[x]+" ");
        }
    }
    public static void main(String[] args)
    {
        int a[]={5,6,6,7,1,1,8,9};
        remoove(a);
    }
}
