
//find the Rectangle in 2D matrix in given Bounded region:-
public class Rectange {
    public static int findRectangle(int a[][], int l1, int r1, int l2, int r2)
    {
        int s=0;
        for(int i=l1;i<=l2;i++)
        {
            for(int j=r1;j<=r2;j++)
            {
                s+=a[i][j];
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans=findRectangle(a,1,2,2,2);
        System.out.println(ans);
    }
}
