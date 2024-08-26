abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Start with key....");
    }
}
class Scooter extends Vehicle{
    void start()
    {
        System.out.println("Start with kick....");
    }
}
class Result
{
public static void main(String[] args)
{
                         Car c1=new Car();
                         c1.start();
                          Scooter s1=new Scooter();
                          s1.start();
}
}