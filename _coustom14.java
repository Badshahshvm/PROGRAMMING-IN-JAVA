import java.util.concurrent.LinkedTransferQueue;

class _circle {
    int radius;

    public void setRadius(int r)
    {
        this.radius = r;
    }
    public float getArea()
    {
        return radius*radius*3.14f;
    }
}
class _Cylinder extends _circle{
    int height;
    public void setHeight(int h)
    {
        height=h;
    }
    public float getVolume()
    {
        return radius*radius*height*3.14f;
    }
    public float getSurfaceArea()
    {
        return 2*height*radius*3.14f;
    }
}

public class _coustom14 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setRadius(7);
        System.out.println(c1.getArea());
        Cylinder c2=new Cylinder();
        c2.setRadius(12);
        System.out.println(c2.getVolume());
        c2.setHeight(14);
        System.out.println(c2.getSurfaceArea());

    }
}
