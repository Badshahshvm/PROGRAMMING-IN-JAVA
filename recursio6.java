public class recursio6 {
    public static int occurance(int arr[] ,int key, int i)
    {
       if(i==arr.length)
       {
           return -1;
       }
       if(arr[i]==key)
       {
           return i;
       }
       return occurance(arr, key, i+1);
    }
    public static void main(String[] args)
    {
        int arr[]={12,67,9,2,3,45,67,8,19,6,7,12};
        System.out.println(occurance(arr,7,0));
    }

}
