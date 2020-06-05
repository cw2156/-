package Dome200604;

import java.time.Year;
import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {
        Calendar a=Calendar.getInstance();
        System.out.println(a);
        a.get(Calendar.YEAR);
        a.get(Calendar.MONTH);
        a.get(Calendar.DAY_OF_MONTH);
        System.out.println( a.get(Calendar.YEAR)+" "+a.get(Calendar.MONTH)+1+" "+ a.get(Calendar.DAY_OF_MONTH));
        a.set(Calendar.YEAR,2029);
        System.out.println( a.get(Calendar.YEAR)+" "+a.get(Calendar.MONTH)+1+" "+ a.get(Calendar.DAY_OF_MONTH));

        a.add(Calendar.YEAR,20);
        System.out.println( a.get(Calendar.YEAR)+" "+a.get(Calendar.MONTH)+1+" "+ a.get(Calendar.DAY_OF_MONTH));
        System.out.println(a.getTime());
    }
}
