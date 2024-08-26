public class BinarySearch2 {
    public static int sqrt(int x)
    {
        int s=0;
        int e=x;
        int ans=-1;
        while(s<=x)
        {
            int mid=s+(e-s)/2;
            int val=mid*mid;
            if(val==x)
            {
                return mid;
            }
            else if(x>val)
            {
                ans=mid;
                s=mid+1;
            }
            else {

                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int x=sqrt(8);
        System.out.println(x);
    }
}
