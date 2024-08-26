public class array {

    public static void update(int marks[], int a)
    {
        a=18;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+5;
        }
    }

    public static void main(String[] args)
    {
        int marks[]={12,45,67,89};
        int a=19;

        update(marks,a);
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
            System.out.println(a);
        }

    }
}
