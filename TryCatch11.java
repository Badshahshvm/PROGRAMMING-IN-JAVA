public class TryCatch11 {
    public static void main(String[] args) {
        System.out.println("1");
        try
        {
            System.out.println(100/0);
            int a[]={2,3,45,};
            System.out.println(a[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot devide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("This index out of bound");
        }
    }
}
