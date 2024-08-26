public class array7 {
    public static void subArray(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            int start=i;
            for(int j=i;j<n.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(n[k] +" ");
                }
                System.out.println();
            }
            System.out.println();


        }
    }
    public static void main(String[] args)
    {
        int n[]={2,3,4,5,6,7,8};
        subArray(n);
    }
}
