public class array1 {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
        public static void decreament(int marks[])
        {
            for(int i=0;i<marks.length;i++)
            {
                marks[i]=marks[i]-5;
            }
        }

        public static void main(String[] args)
        {
            int marks[]={34,89,96};
            update(marks);
            for(int i=0;i<marks.length;i++)
            {
                System.out.println(marks[i]);
            }
            decreament( marks);
            for(int i=0;i<marks.length;i++)
            {
                System.out.println(marks[i]);
            }


        }
    }

