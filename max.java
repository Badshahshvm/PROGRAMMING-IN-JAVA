public class max {
    public static void main(String[] args)
    {
        int arr[]={234,678,453,90,432,};
        int big=0;
        for(int e:arr)
        {
            if(e>big)
            {
                big=e;
            }
        }
        System.out.println("the value of maximum in this array is "+ big);
    }
}
