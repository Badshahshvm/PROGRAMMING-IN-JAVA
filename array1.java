public class array1 {
    public static void main(String[] args) {
        int marks [] ={32,56,45,76,68};
        int i;
        System.out.println(marks.length);
        System.out.println(marks[2]);
        for(i=0;i<=marks.length-1;i++)
        {
            System.out.println(marks[i]);
        }
        for(int element:marks)
        {
            System.out.println(element);
        }
    }
}
