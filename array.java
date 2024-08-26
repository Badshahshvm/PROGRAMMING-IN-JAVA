public class array {
    public static void main(String[] args)
    {
        int [] marks={57,89,67,54,34};

        System.out.println(marks[4]);
        System.out.println(marks.length);
        char [] ch = {'a','e','o','i','u'};
        System.out.println(ch.length);
        System.out.println(ch[3]);
        String[] students={"Shivam","Bigboss","Vikash","Anuraag"};
        System.out.println(students.length);
        System.out.println(students[2]);
        for(String element:students)
        {
            System.out.println(element);
        }
        for(int element:marks)
        {
            System.out.println(element);
        }
        for(char element:ch)
        {
            System.out.println(element);
        }

    }
}
