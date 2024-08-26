import java.util.Arrays;

public class MaximumSubssequence {



    public static int maximumSubsequenceSum(int a[],int i)
    {
        int n=a.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int ans=helper(a,a.length-1,dp);
        return ans;

    }
    public static int helper(int a[],int i, int dp[])
    {
        if(i<0)
        {
            return 0;
        }
        if(dp[i]!=-1) {
            return dp[i];
        }
            int x=helper(a,i-1,dp);
            int y=helper(a,i-2,dp)+a[i];
            dp[i]=Math.max(x,y);
            return Math.max(x,y);

    }

    public static void main(String[] args) {
        int a[]={2,3,4};
        System.out.println(maximumSubsequenceSum(a,a.length-1));
    }
}
