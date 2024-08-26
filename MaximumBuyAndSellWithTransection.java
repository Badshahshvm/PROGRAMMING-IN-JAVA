public class MaximumBuyAndSellWithTransection {


    public static int maxProfit(int a[], int fee)
    {
        int n = a.length;
        int ans = 0;
        int nb = a[0];
        for(int i=0;i<n;i++)
        {
            if (a[i] < nb)
                nb = a[i];
            if(a[i] > nb + fee)
            {
                ans += a[i] - fee - nb;
                nb = a[i]-fee ;
            }

        }
        return ans;
    }
    public static void main(String[] args)
    {
        int prices[]={1,3,2,8,4,9};
        int ans=maxProfit(prices,2);
        //second case:-
        int prices2[]={1,3,7,5,10,3};
        int ans2=maxProfit(prices2,3);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
