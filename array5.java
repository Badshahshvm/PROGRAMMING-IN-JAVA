public class array5 {
    public static void main(String[] args) {
        int marks[]={57,45,67,23,98};
        int t,i,j;
        System.out.println(marks.length);
        //l=marks[0];
        for(i=0;i<5;i++)
        {
            for(j=0;j<4;j++)
            {
                if (marks[j] > marks[j+1])
                {
                    t=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=t;
                    //System.out.printf("%d\t",marks[i]);
                }

            }

        }
        for(i=0;i<5;i++) {
            System.out.printf("%d\t", marks[i]);
        }    }
}
