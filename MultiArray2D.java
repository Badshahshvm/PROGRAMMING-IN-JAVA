public class MultiArray2D {
    public static int[][] multiplyOf2DArray(int a[][],int b[][],int r1, int c1, int r2, int c2)
    {
        int mul[][]=new int[r1][c2];
        if(c1!=r2)
        {
            System.out.println("not possible...");
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    mul[i][j]=(a[i][k]*b[k][j]);
                }
            }
        }
        return mul;
    }
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
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6}, };
        int b[][]={{1,2,3,4},{4,5,6,7}};
        int ans[][]=multiplyOf2DArray(a,b,2,3,2,4);
        printArray(ans);
    }
}
