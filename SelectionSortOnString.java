public class SelectionSortOnString {
    public static  void selectionSort(String s[])
    {
        int n=s.length;
        for(int i=0;i<n;i++)
        {
            int min=0;
            for(int j=i+1;j<n;j++)
            {
                if(s[j].compareTo(s[min])<0)
                {
                    min=j;
                }
            }
      String t=s[i];
            s[i]=s[min];
            s[min]=t;
        }
    }

    public static void main(String[] args) {
        String ans[]={"puppy","ram","boy","all"};
        selectionSort(ans);
        for(int i=0;i< ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
