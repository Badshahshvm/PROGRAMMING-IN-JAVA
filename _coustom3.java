class Workers
{
    int id;
    String name;
    int sallery;
    int working_hours;
    int profit;
    public void getDetails()
    {
        System.out.println("my id is" + id);
        System.out.println("worker name is" + name);
        System.out.println("payscale:" + sallery);
        System.out.println("workin hours" + working_hours);

    }
    public int getProfit()
    {
        return profit;
    }
}

public class _coustom3 {
    public static void main(String[] args)
    {
        Workers w1=new Workers();
        w1.name= "shuvam";
        w1.sallery= 5000;
        w1.id= 1756;
        w1.working_hours= 5;
        w1.getDetails();
        Workers w2=new Workers();
        w2.id= 5678;
        w2.sallery= 14000;
        w2.name= "SHIVAM";
        w2.working_hours= 8;
        w2.getDetails();
        w2.profit=900;
        int profit=w2.getProfit();
        System.out.println(profit);
    }
}
