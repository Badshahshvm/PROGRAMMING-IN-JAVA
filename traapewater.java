import java.util.concurrent.LinkedTransferQueue;

public class traapewater {
    public static int storedWater(int height[])
    {
     int n=height.length;
     int leftmax[]=new int[n];
     int water=0, waterlabel=0;
     leftmax[0]=height[0];
     for(int i=1;i<=n;i++)
     {
         leftmax[i]=Math.max(height[i],leftmax[i+1]);
     }
     int rightmax[]=new int[n];
     rightmax[n-1]=height[n-1];
     for(int i=n-2;i>=0;i--)
     {
         rightmax[i]=Math.max(height[i], rightmax[i+1]);

     }
     for(int i=0;i<n;i++)
     {
          waterlabel=Math.min(leftmax[i], rightmax[i]);
          water=waterlabel-height[i];
     }

     return water;

    }
    public static void main(String[] args)
    {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(storedWater(height));
    }
}
