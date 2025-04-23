public class Array3D {
    public static void main(String[] args) {
        int [][][]a={{{10,20},{30,40,50},{70,80,9,}}};
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[0][0].length);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k+)
                {
                    System.out.print(a[i][j][k]+" ")
                }
            }
        }

    }

}
