public class method3 {
    static void change(int [] arr)
    {
        arr[2]=76;
        arr[0]=1;
    }
    public static void main(String[] args)
    {
        int [] marks={34,67,89,45};
        change(marks);
        System.out.println("the value after changing in array:"+marks[2]);
        change(marks);
        System.out.println("the value after changing in array:"+marks[0]);
        System.out.println(marks.length);
    }
}
