 class oops2 {
    public static void main(String[] args)
    {
            Fruits f1=new Fruits();
            f1.name="Apple";
        System.out.println(f1.getName());
        f1.price=15;
        System.out.println(f1.getPrice());
        f1.name="banana";
        System.out.println(f1.getName());
    }
}
class Fruits
{
    String name;
    int price;
    void setName(String newName)
    {
        this.name=newName;
    }
    void setPrice(int price)
    {
        this.price=price;
    }
    String getName()
    {
        return this.name;
    }
    int getPrice()
    {
        return this.price;
    }
}