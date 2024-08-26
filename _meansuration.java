class Sphere
{
    float radius;
    float height;
    public Sphere()
    {
         radius=56.7f;
         height=21;
    }
    public void setRadius(float r)
    {
        this.radius=r;
    }
    public void setHeight(float h)
    {
        this.height=h;
    }
    public float getArea()
    {
        return 4*radius*radius*3.14f;
    }
    public float getVolume()
    {
        return (4*radius*radius*radius*3.14f)/3;
    }
}
public class _meansuration
{
    public static void main(String[] args)
    {
        Sphere s1=new Sphere();
        System.out.println(s1.getVolume());

    }
}
