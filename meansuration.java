class Cylinder
{
   private float radius;
   private float height;
    public Cylinder()
    {
        height=56;
        radius=21;
    }
    public void setRadius(float r)
    {
        this.radius=r;
    }
    public void setHeight(float h)
    {
        this.height=h;
    }
    public float getSurfaceArea()
    {
        return 2*radius*height*3.14f;
    }
    public float getVolume()
    {
        return radius*radius*height*3.14f;
    }
}
public class meansuration
{      public static void main(String[] args)
{
    Cylinder c1=new Cylinder();
    System.out.println(c1.getVolume());
    System.out.println(c1.getSurfaceArea());

}

}
