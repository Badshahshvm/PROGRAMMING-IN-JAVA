class Employee
{
    private int sallery;
    public void setSallery(int s)
    {
        sallery=s;
    }
    public int getSallery()
    {
        return sallery;
    }

}



public class EncapsulationOOP {

    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.setSallery(400);
        System.out.println(e1.getSallery());
    }
}
