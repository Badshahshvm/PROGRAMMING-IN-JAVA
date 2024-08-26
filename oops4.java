
  class myemployee{
    private int id;
    private String name;
      public void setname(String a)
      {
          name=a;
      }
      public void setid(int b)
    {
        id=b;
    }
      public String getname()
      {
          return name;
      }
      public int getid()
      {
          return id;
      }

  }
public class oops4 {
    public static void main(String[] args) {
        myemployee vikash=new myemployee();
        vikash.setname("inclusive world");
        vikash.setid(98);
        System.out.println(vikash.getname());
        System.out.println(vikash.getid());
    }
}
