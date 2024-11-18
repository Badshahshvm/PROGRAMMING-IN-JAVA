public class Permuattion {


    public static void swap(char ch[],int i,int j)
    {
        char t=ch[i];
        ch[i]=ch[j];
        ch[j]=t;
    }
    public static void permutate(char ch[],int l, int r)
    {
        if(l==r)
        {
            System.out.println(String.valueOf(ch));
        }

        for(int i=l;i<=r;i++)
        {
            swap(ch,l,i);
            permutate(ch,l+1,r);
            swap(ch,l,i);
        }
    }
    public static void main(String[] args)
    {
        String ans="123";
        char ch[]=ans.toCharArray();
  permutate(ch,0,ch.length-1);
    }
}
