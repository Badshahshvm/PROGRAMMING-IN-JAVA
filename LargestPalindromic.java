import java.util.ArrayList;

public class LargestPalindromic {
    public static boolean validate(ArrayList<Integer> frequency )
    {
        boolean isOdd=false;
        for(int i=0;i<frequency.size();i++)
        {
            if(frequency.get(i)%2!=0)
            {

                if(isOdd)
                {
                    return false;
                }
                isOdd=true;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        String result="";
        String first="";
        String second="";
        String num="313551";
        int n=num.length();
        ArrayList<Integer> frequency=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            frequency.add(0);
        }
        for(int i=0;i<n;i++)
        {
            int digit=num.charAt(i)-'0';
            frequency.set(digit, frequency.get(digit)+1);
        }
        if(!validate(frequency))
        {


            System.out.println("not possible");


        }
        for(int i=9;i>=0;i--)
        {
            while(frequency.get(i)>1)
            {
                first+=i;
                frequency.set(i,frequency.get(i)-2);
            }
        }
        StringBuilder sb=new StringBuilder(first);
        sb.reverse();
        second=sb.toString();

        for(int i=9;i>=0;i--)
        {
            if(frequency.get(i)==1)
            {
                first+=i;
            }
        }
        result=first+second;
        System.out.println(result );



    }
    }


