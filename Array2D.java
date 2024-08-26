import java.util.Scanner;

public class Array2D {



    public static void printArray2D(int a[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void inputArr(int a[][])
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=x.nextInt();
            }
        }
    }
    public static void main(String[] args)
    {
        int a[][]=new int[3][3];
        inputArr(a);
        printArray2D(a);
    }
}
