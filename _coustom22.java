class Monkey
{
    public void doActivity()
    {
        System.out.println("jump from one tree to another tree");
    }
    public void bite()
    {
        System.out.println(" when he is angry....he starts biting");
    }
}
interface BasicAnimals
{
    void eat();
    void sleep();

}
class Human extends Monkey implements BasicAnimals
{
    public void printBasic()
    {
        System.out.println("they can speak");
    }
    public void eat()
    {
        System.out.println("animal eat grass,meat,etc...depends on their type...like that hervivorous,carnivorous...");
    }
    public void sleep()
    {
        System.out.println("they can sleep anywhere n the jungle");
    }
}





public class _coustom22 {
    public static void main(String[] args) {
        Human h1=new Human();
        h1.doActivity();
        h1.eat();
        h1.bite();
        h1.printBasic();
        Monkey m1=new Human();
        m1.doActivity();
        m1.bite();

    }
}
