package _COUSTOM27;

import java.awt.dnd.DropTargetEvent;
import java.util.Date;

public class _coustom41 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d = new Date();
        System.out.println((d));
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }
}
