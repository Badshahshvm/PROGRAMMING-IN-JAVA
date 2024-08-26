class Router
{
    void show()
    {
        System.out.println("1");
        class inner
        {
            void display()
            {
                System.out.println("2");
            }
        }
        inner i=new inner();
        i.display();
    }
}
public class Nested2 {
    public static void main(String[] args) {
        Router a1=new Router();
        a1.show();
    }
}
