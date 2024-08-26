class circle
{
   private int radius;
   public void setdata(int a)
   {
       radius=a;
   }
    public int getdata(){
        return 3*radius*radius;
    }
}
public class oops5 {
    public static void main(String[] args) {
         circle vikash=new circle();
         vikash.setdata(6);
       // System.out.println("radius="+vikash.setdata(6));
        System.out.println("area="+vikash.getdata());
    }
}
