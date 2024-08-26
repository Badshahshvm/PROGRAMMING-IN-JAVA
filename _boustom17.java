interface Bycycle
{ int a=895;
    void applyBreak(int decreament);
    void speedUp(int increament);
}
interface Car
{
    int speed=80;
    void companyName();
    void carPrice(int rupees);
}

class Avon implements Bycycle{
    public void blowHorn1(){
        System.out.println("pi pi..po...po..");
    }
    public void blowHorn2()
    {
        System.out.println("coustom song");
    }
    public void applyBreak(int decreament)
    {
        System.out.println("apply....break");
    }
    public void speedUp(int increament)
    {
        System.out.println("speed becomes very fast:");
    }
    public void backBreak()
    {
        System.out.println("stop");
    }
}



public class _boustom17 {
    public static void main(String[] args) {
        Avon b1 = new Avon();
        b1.applyBreak(5);//we can create properties in interface:
        //but we cant modify the properties at any where after define in interface

        b1.speedUp(4);
        System.out.println(b1.a);
        Avon a2=new Avon();
        a2.applyBreak(6);
        a2.speedUp(56);
        a2.backBreak();



    }

}
