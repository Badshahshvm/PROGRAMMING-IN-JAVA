public class ReverseS {
    public static String reverseString(String s, int i)
    {
        if(i==s.length())
        {
            return "";
        }
        String s1=reverseString(s,i+1);
        return s1+s.charAt(i);
    }
    public static void printSubStringSequence(String s, String curr)
    {
        if(s.length()==0)
        {
            System.out.println(curr);
            return;
        }
        char ch=s.charAt(0);
        String rs=s.substring(1);
        printSubStringSequence(rs,curr+ch);
        printSubStringSequence(rs,curr);
    }
    public static void subSetSum(int a[], int n,int i, int sum)
    {
        if(i>=n)
        {
            System.out.println(sum);
            return;

        }
        subSetSum(a,n,i+1,sum+a[i]);
        subSetSum(a,n,i+1,sum);
    }
    public static void main(String[] args)
    {
        String s=reverseString("Shivam",0);
        System.out.println(s);
        printSubStringSequence("abc","");
        int a[]={2,3};
        int sum=0;
        subSetSum(a,a.length,0,sum);
    }
}
