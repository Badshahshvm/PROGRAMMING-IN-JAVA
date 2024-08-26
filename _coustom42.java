package _COUSTOM27;

import java.sql.SQLOutput;
import java.util.Calendar;

public class _coustom42 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.HOUR) +":"+c.get(Calendar.MINUTE) +":"+c.get(Calendar.SECOND) +":"+c.get(Calendar.DATE) );


    }
}
