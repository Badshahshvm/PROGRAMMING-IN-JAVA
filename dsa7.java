import com.sun.security.jgss.GSSUtil;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class dsa7 {

    public static boolean targetSum(ArrayList<Integer> list, int target)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)+list.get(j)==target)
                {


                    System.out.println("i"+" "+j);
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(5);
        list.add(5);
        list.add(10);
        int t=15;
         boolean ans= targetSum(list, t);
        System.out.println(ans);
    }

}
