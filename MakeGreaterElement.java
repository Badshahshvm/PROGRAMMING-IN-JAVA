import java.util.*;
public class MakeGreaterElement {
    public static void reverse(char ch[],int i, int j)
    {
        while(i<=j)
        {
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;
            j--;
        }
    }
    public static int makeGreaterNumber(int n)
    {
        char ch[]=Integer.toString(n).toCharArray();
        Arrays.sort(ch);
        reverse(ch,0,ch.length-1);
        return  Integer.parseInt(new String(ch));

    }

    public static void main(String[] args) {
        System.out.println(makeGreaterNumber(584432));
    }
}
