public class array3 {
    public static void main(String[] args) {
        int marks []={45,56,67,87,76};
        int i;
        System.out.println(marks.length);
        for(i=marks.length-1;i>=0;i--)
        {
            System.out.printf("%d\t",marks[i]);
        }
    }
}
