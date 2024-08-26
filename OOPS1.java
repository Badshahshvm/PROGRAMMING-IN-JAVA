class employee{
    int salary;
    String name;
    public int getsalary()
    {
        return salary;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String n)
    {
        name =n;
    }
    public void setSalary(int a)
    {
       salary=a;
    }
}
public class OOPS1
{
    public static void main(String[] args) {
        employee vikash=new employee();
        vikash.setname("the soulmates");
       // System.out.println(vikash.name);
        System.out.println(vikash.getname());
        //vikash.salary=40;
        vikash.setSalary(500);
        System.out.println(vikash.getsalary());
        vikash.setSalary(700);
        System.out.println(vikash.getsalary());

    }
}
