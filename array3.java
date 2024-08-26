import java.util.Scanner;

public class array3 {
   public static int largest(int number[])
   {
       int max=Integer.MIN_VALUE;
     for(int i=0;i<number.length;i++)
     {
         if(max<number[i])
         {
             max=number[i];
         }
     }
     return max;
   }
   public static int smaller(int number[])
   {
       int min=Integer.MAX_VALUE;
       for(int i=0;i<number.length;i++)
       {
           if(min>number[i])
           {
               min=number[i];
           }
       }
       return min;
   }
   public static void main(String[] args)
   {
       Scanner x=new Scanner(System.in);
       int number[]={56,78,90,99,112};
       System.out.println( "larger number is " + largest(number));
       System.out.println("Smaller number is "+ smaller(number));


   }
}
