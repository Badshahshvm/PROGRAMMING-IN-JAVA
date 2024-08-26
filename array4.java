public class array4 {
    public static void main(String[] args) {
        int marks[]={28,34,42,21,43};
        int i,l;
        l=marks[0];
        for(i=0;i<marks.length;i++)
        {
            if(l<marks[i])
            {
                l=marks[i];
            }
        }
        System.out.printf("%d",l);
    }
}
