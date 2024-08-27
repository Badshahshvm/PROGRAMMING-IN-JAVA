public class AnonymousArray {
    public static int sum(int a[])
    {
        int s=0;
        for(int val:a)
        {
            s+=val;
        }
        return s;
    }
    public static void main(String[] args) {
        int ans=AnonymousArray.sum(new int[]{12,23,45});
        System.out.println(ans);

    }
}
