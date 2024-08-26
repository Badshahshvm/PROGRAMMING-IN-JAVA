public class BinarySearch {


    public static boolean binary(int a[],int s, int e, int x)
    {

        if(s>e) {
            return false;
        }
            int mid=s+(e-s)/2;
            if(a[mid]==x)
            {
                return true;
            }
            else if(x>a[mid])
            {
                return binary(a,mid+1,e,x);

            }
            else {
                return binary(a,s,mid-1,x);
            }

    }
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        System.out.println(binary(a,0,a.length-1,4));
    }
}
