import java.util.Scanner;

public class recursion5 {
    public static boolean isSorted(int arr[] , int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }

       return  isSorted(arr, i+1);
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter any number:- ");
        int arr[]={7,12,1,8,2,4};
        System.out.println(isSorted(arr, 1));
    }
}
