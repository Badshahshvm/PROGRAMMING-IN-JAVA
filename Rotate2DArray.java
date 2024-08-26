public class Rotate2DArray {
    public static int [][] transpose(int a[][], int r, int c)
    {
        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[i][j]=a[j][i];
            }
        }
        return ans;
    }
    public static void reverse(int a[][])
    {
        int i=0, j=a.length-1;
        while(i<j)
        {
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;
            i++;
            j--;
        }
    }
    public static void rotateArrayAt90(int a[][],int n)
    {
        int ans[][]=transpose(a,n,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                reverse(a);
            }
        }
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
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotateArrayAt90(a,3);
        printArray(a);

    }
}
