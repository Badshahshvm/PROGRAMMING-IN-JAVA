


class Student
{
  private int roll;
    private String name;
   private float cgpa;

    public Student()
        {
            roll=36;
            name="Shivam";
            cgpa=8.9f;


        }
        public int getRoll()
        {
            return roll;
        }
        public void setRoll(int n)
        {
           this.roll=n;
        }
        public String getName()
        {
            return name;
        }

    public void setName(String x)
    {
        this.name=x;
    }
    public void setCgpa(float a)
    {
        this.cgpa=a;
    }
    public float getCgpa()
    {
        return cgpa;
    }
}
public class _coustom7 {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.getRoll());

    }
}
