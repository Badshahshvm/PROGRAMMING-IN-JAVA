public class TransposeMatrix {

    public static int[][] transposeMatrix(int a[][],int r,int c)
    {
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                ans[i][j]=a[j][i];
            }
        }
        return ans;
    }
    public static void printArray(int a[][],int r, int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int a[][]={{1,2},{4,5},{7,8}};
        int t[][]=transposeMatrix(a,3,2);
        printArray(a,3,2);

    }
}
