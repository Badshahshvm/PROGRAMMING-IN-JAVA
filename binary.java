import java.util.Scanner;

public class binary {
    public static int binaryto(int a[], int key)
    {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(key==a[mid])
            {
                return mid;
            }
            if(key>mid)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int a[]={12,18,45,47,73};
        int key=73;
        Scanner x=new Scanner(System.in);
        int index=binaryto(a,key);
        System.out.println("index is "+index);
    }
}
