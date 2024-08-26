public class array6 {
    public static void printPairs(int n[])
    {   int tp=0;
        for(int i=0;i<n.length;i++)
        {
            int current=n[i];

            for(int j=i+1;j<n.length;j++)
            {
                System.out.print("("+ current+","+n[j]+")"+ " ");
                tp++;
            }
            System.out.println(" ");

        }
        System.out.println(tp);

    }
    public static void main(String[] args)
    {
        int n[]={4,6,8,9,2,5,11,17};
        printPairs(n);
    }
}
