class Father
{
    int age;
    String name;
    public void setAge(int a)
    {
        this.age=a;
    }

    public void setName(String n) {
        this.name=n;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
class Son extends Father
{
    String member;
    public void setMember(String x)
    {
        member=x;
    }
    public String getMember()
    {
        return member;
    }

}
public class _coustom9
{ public static void main(String[] args)
{
    Father f1=new Father();
    f1.setAge(67);
    System.out.println(f1.getAge());
    f1.setName("RAM CHARAN SINGH");
    System.out.println(f1.getName());
    Son s1=new Son();
    s1.setMember("mother");
    System.out.println(s1.getMember());
    s1.setAge(15);
    System.out.println(s1.getAge());
    s1.setName("MOHAN SINGH");
    System.out.println(s1.getName());
   // f1.setMember("grandy");
   // System.out.println(f1.getMember());

}
}
