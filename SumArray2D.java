public class SumArray2D {
    public static int [][] sumOf2DArray(int a[][],int b[][],int r1,int c1,int r2,int c2)
    {
        if(r1!=r2 ||c1!=c2)
        {
            System.out.print("not possible.....");
        }
        int ans[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                ans[i][j]=a[i][j]+b[i][j];
            }
        }

        return ans;
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
        int a[][]={{1,2,3},{4,5,6},{7,8,9}
        };
        int b[][]={{10,11,12},{13,14,15},{16,17,18}};
        int s[][]=sumOf2DArray(a,b,3,3,3,3);
        printArray(s);

    }
}
