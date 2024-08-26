class star{
    public int i, j;
    private int n;
    public void setdata(int c)
    {
        n=c;
    }
    public int getdata(){
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.printf("*");
            }
            System.out.println("\n");
        }
        return 0;
    }
}
public class oops6 {
    public static void main(String[] args) {
        star vikash=new star();
        vikash.setdata(5);
        System.out.println(vikash.getdata());
    }
}
