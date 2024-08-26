public class array4 {
    public static int binarySearh(int number[], int key)
    {
        int start=0, end=number.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(number[mid]==key)
            {
                return mid;
            }
            if(number[mid]<key)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return-1;

    }
    public static void main(String[] args)
    {
        int number[]={67,89,14,34,65,18,19,10,45,43,41};
        int key=19;
        System.out.println(binarySearh(number, key));


    }
}
