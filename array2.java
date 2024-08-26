public class array2 {
    public static void main(String[] args) {
        float marks []={43.56f,56.67f,54.67f,43.89f,87.67f};
        int i;
        float sum=0;
        System.out.println(marks.length);
        for(i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        System.out.printf("%.2f",sum);
    }
}
