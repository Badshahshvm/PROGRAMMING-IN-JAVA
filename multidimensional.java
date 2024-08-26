public class multidimensional {
    public static void main(String[] args)
    {
        int [][] flat=new int[3][3];
        flat [0][0]=100;
        flat[0][1]=101;
        flat[0][2]=102;
        flat[1][0]=103;
        flat[1][1]=104;
        flat[1][2]=105;
        flat[2][0]=106;
        flat[2][1]=107;
        flat[2][2]=108;
        int i,j;
        for(i=0;i<flat.length;i++)
        {
            for(j=0;j<flat.length;j++)

            {
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
