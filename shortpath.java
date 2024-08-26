public class shortpath {
    public static float shortPath(String direction)
    {
        int x=0,y=0;
        for(int i=0;i<direction.length();i++)
        {   char dir=direction.charAt(i);

            if(dir=='S')
            {
                y--;
            } else if (dir == 'N')
             {
                y++;

            }
            else if(dir=='E'){
                x++;
            }
            else {
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String[] args)
    {
        String direction="NSWESW";
        System.out.println(shortPath(direction));

    }
}
