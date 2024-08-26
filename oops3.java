class square{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimetre()
    {
        return 4*side;
    }
}
public class oops3 {
    public static void main(String[] args) {
        square vikash=new square();
        //vikash.side=7;
        vikash.side=6;
        System.out.println("side="+vikash.side);
        System.out.println("area="+vikash.area());
        System.out.println("perimeter="+vikash.perimetre());
        vikash.side=12;
        System.out.println("side="+vikash.side);
        System.out.println("area="+vikash.area());
        System.out.println("perimeter="+vikash.perimetre());
        square vikash1=new square();
        vikash1.side=13;
        System.out.println("side="+vikash1.side);
        System.out.println("area="+vikash1.area());
        System.out.println("perimeter="+vikash1.perimetre());
    }
}
