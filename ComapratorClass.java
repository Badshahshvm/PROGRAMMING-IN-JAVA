import java.util.*;
 class StudentProject
        {
            String name;
            int marks;
            StudentProject(String name, int marks)
            {
                this.name=name;
                this.marks=marks;
            }
        }
public class ComapratorClass {

     public static String [] compareStringLength(String s[])
     {
         List<String> l1=Arrays.asList(s);
         l1.sort((a,b)->a.length()-b.length());
         String ans[]=l1.toArray(new String[0]);
         return ans;
     }

    public static  void main(String[] args) {

        List<String> l1=Arrays.asList("Shivam","Arun","Nia");
                l1.sort((a,b)->a.length()-b.length());

                        for(String val:l1)
                        {
                            System.out.print(val+" ");
                        }

                        String a[]={"shiva","ria","ro","mohan","shaubhyagati"};
        System.out.println();
                        String ans[]=compareStringLength(a);

                        for(String val:ans)
                        {
                            System.out.print(val+" ");
                        }
        System.out.println();
        // List of StudentProject objects
        List<StudentProject> students = new ArrayList<>();
        students.add(new StudentProject("Alice", 85));
        students.add(new StudentProject("Bob", 75));
        students.add(new StudentProject("Charlie", 95));

        // Sorting students based on marks
        students.sort((s1, s2) -> s1.marks - s2.marks);
        System.out.println();
        System.out.println("Sorted students by marks:");
        for (StudentProject student : students) {
            System.out.println(student.name + " - " + student.marks);
        }


    }
}
