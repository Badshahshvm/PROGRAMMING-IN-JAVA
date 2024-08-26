class Rectangle
{
    int length;
    int breadth;
    public void setLength(int l)
    {
        length=l;
    }
    public void setBreadth(int b)
    {
        breadth=b;
    }
    public int getArea()
    {
        return length*breadth;
    }
    public int getPerimeter()
    {
        return 2*(length+breadth);
    }
}

public class _coustom5 {
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle();
        r1.setLength(9);
        r1.setBreadth(5);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        Rectangle r2=new Rectangle();
        r2.setLength(56);
        r2.setBreadth(43);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        Rectangle r3=new Rectangle();
        r3.setLength(87);
        r3.setBreadth(43);
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());

    }
}
