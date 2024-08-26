public class array2 {
    public static int search(int a[], int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int a[]={12,45,67,13,48,67,89,10};
        int key=7;
        int index=search(a,key);
        if(index==-1)
        {
            System.out.println("not found....");

        }
        else {
            System.out.println("index is "+ index);
        }
    }
}
