class Router1
{
    static class Router2
    {
        void show()
        {
            System.out.println("how are you.....");
        }
    }

}


public class StaticNested {
    public static void main(String[] args) {
        Router1.Router2 r=new Router1.Router2();
        r.show();
    }
}
