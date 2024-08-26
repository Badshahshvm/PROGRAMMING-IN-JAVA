class Circle
{
    float Radius;
    public void setRadius(float r)
    {
        Radius=r;
    }
    public float getArea()
    {
        return Radius*Radius*3.14f;
    }
    public float getPerimeter()
    {
        return 2*Radius*3.14f;
    }
}
public class _coustom6 {
    public static void main(String[] args)
    {
        Circle c1=new Circle();
        c1.setRadius(9.7f);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }

}
