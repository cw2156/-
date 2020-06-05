package Dome200604;

import org.w3c.dom.CDATASection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.crypto.Data;
import java.util.Scanner;

public class DATAapi {
    public static void main(String[] args) throws ParseException {
        System.out.println("当前日期的毫秒");
        System.out.println(System.currentTimeMillis());
        dome01();
    }
    public static void dome01() throws ParseException {
        System.out.println("输入自己的生日，获取自己生日的毫秒");
        Scanner scanner=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date abc=sdf.parse(scanner.next());
        Date date= new Date();
        long ab=abc.getTime();
        System.out.println("生日的毫秒数");
        System.out.println(ab);
        System.out.println("两个时间相减当前日期和出生日期");
        long ac=date.getTime()-abc.getTime();
        System.out.println(ac/1000/60/60/24+"天");




    }
}
