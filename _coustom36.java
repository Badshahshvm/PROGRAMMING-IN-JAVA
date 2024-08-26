package _COUSTOM27;

import java.util.ArrayList;

public class _coustom36 {
    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList();
        a1.add(34);
        a1.add(45);
        a1.add(67);
        a1.add(38);
        a1.add(31);
        for(int i=0;i<a1.size();i++)
        {
            System.out.println(a1.get(i));
        }

        a1.add(3,9);
        System.out.println(" ");
        for (int i=0;i<a1.size();i++)
              {
                  System.out.println(a1.get(i));

        }

    }
}
