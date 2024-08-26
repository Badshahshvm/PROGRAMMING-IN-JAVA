import java.util.Stack;

public class Rsubsequences {
    public static int[] deleteConse(int a[])
    {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<a.length;i++)
        {
            if(s.size()==0||s.peek()!=a[i])
            {
                s.push(a[i]);
            }
           else if(a[i]==s.peek())
            {
                if( a[i]!=a[i+1])
                {
                    s.pop();
                }
            }
        }
        int r[]=new int[s.size()];
        int m=r.length;
        for(int i=m-1;i>=0;i--)
        {
            r[i]=s.pop();
        }
        return r;
    }

    public static void main(String[] args) {
        int a[]={1,2,2,2,3,4,4,4,5,6,7,7,8,9};
        int ans[]=deleteConse(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
