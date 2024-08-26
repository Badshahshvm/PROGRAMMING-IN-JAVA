package _COUSTOM27;

import java.util.ArrayList;

public class _coustom38 {
    public static void main(String[] args) {
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>(5);
        t2.add(34);
        t2.add(23);
        t2.add(88);
        t1.add(5);
        t1.add(4);
        t1.add(6);
        t1.add(7);
        t1.add(8);
        t1.add(9);
        t1.addAll(t2);
        System.out.println(t1.size());
        System.out.println(t1.contains(16));
        System.out.println(t1.contains(99));
        System.out.println(t1.indexOf(8));
        t1.remove(3);
        t1.removeAll(t2);
        t1.set(1,0);
        for(int i=0;i<t1.size();i++)
        {
            System.out.print(t1.get(i));
            System.out.print(", ");
        }
        }
    }

