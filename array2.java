public class array2 {
    public static int linearTo(int number[], int key)
    {
        for(int i=0;i<number.length;i++)

        {
            if(number[i]==key)
            {
                return i;
            }
        }

            return -1;
    }
    public static void main(String[] args)
    {
        int number[]={45,8,90,23,14,85,62};
        int key=8;
       int index= linearTo(number, key);
       if(index==-1)
       {
           System.out.println("not found");
       }
       else{
           System.out.println("Index is " + index);
       }

    }
}
