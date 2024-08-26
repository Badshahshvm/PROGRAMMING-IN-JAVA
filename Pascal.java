public class Pascal {
    public static void printArray(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] pascalMatrix(int n)
    {
        int [][]ans=new int[n][];
        for(int i=0;i<n;i++)
        {
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++)
            {
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int ans[][]=pascalMatrix(5);
        printArray(ans);
    }

}
