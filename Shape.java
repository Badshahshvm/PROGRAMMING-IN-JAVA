import javax.print.attribute.standard.Sides;

class Square
{
    float side;

    public float getSide()
    {
        return side;

    }
    public float getPerimeter()
    {
        return 4*side;
    }
    public float getArea()
    {
        return side*side;
    }
}

public class Shape {
    public static void main(String[] args)
    {
        Square s1=new Square();
        s1.side=5;
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());
        Square s2=new Square();
        s2.side=19.8f;
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getArea());
        Square s3=new Square();
        s3.side=87;
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getArea());
        Square s4=new Square();
        s4.side=65;
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());

    }
}
