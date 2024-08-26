public class array5 {
    public static void reverse(int n[])
    {
        int first=0, last=n.length-1;
        while(first<last)
        {
            int temp=n[last];
            n[last]=n[first];
            n[first]=temp;
            first++;
            last--;
        }

    }
    public static void main(String[] args)
    {
        int n[]={12,13,14,15,16,17,18,22};
        reverse(n);
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i] +" ");
        }

    }
}
