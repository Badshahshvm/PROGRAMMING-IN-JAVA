class Employee
{
    int id;
    String name;
    int sallery;
}
public class coustom {
    public static void main(String[] args)
    {
        System.out.println("this is our coustom class:");
        Employee shivam =new Employee();//instantionating the emplyee object
        //setting the attributes
        shivam.id=12;
        shivam.name="SHIVAM";
        shivam.sallery=140000;
        System.out.println(shivam.id);
        System.out.println(shivam.name);
        System.out.println(shivam.sallery);
        Employee e2=new Employee();
        e2.id=3;
        e2.name="VIKASH";
        e2.sallery=1200000;
        System.out.println(e2.name);
        System.out.println(e2.sallery);
        System.out.println(e2.id);

    }
}
