import java.util.Stack;
//check wheather a given bracket sequence is balanced or not:-
public class BalancedBracketStack {
    public static boolean balancedBracket(String s)
    {
        Stack<Character> s1=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        { char ch=s.charAt(i);
            if(ch=='(')
            {
                s1.push(ch);
            }
            else {
                if(s1.size()==0)
                {
                    return false;
                }
                 if(s1.peek()=='(')
                {
                    s1.pop();
                }

            }

        }
        if(s1.size()>0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(balancedBracket("(())("));
        System.out.println(balancedBracket("(())()"));
    }
}
