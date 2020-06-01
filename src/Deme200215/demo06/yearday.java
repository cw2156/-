package Deme200215.demo06;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class yearday {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输出年份");
        System.out.println("请输出月份");
        int a = sc1.nextInt();//年
        int b = sc2.nextInt();//月
        YYYY(a, b);
    }

    public static void YYYY(int a, int b) {//输入计算
        int year = a;//年
        int yue = b;//月
        int sumday1 = 0;//计算年的时间
        int sumday2 = 0;//计算月的时间
        for (int y1900 = 1900; y1900 < year; y1900++) {//以1900年为初始年份
            if (y1900 % 4 == 0 && y1900 % 100 != 0) {
                sumday1 += 366;
            } else if (y1900 % 400 == 0) {
                sumday1 += 366;
            } else
                sumday1 += 365;
        }
        if (year % 4 == 0 && year % 100 != 0) {//闰年的判断
            for (int i = 1; i < yue; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    sumday2 += 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    sumday2 += 30;
                } else
                    sumday2 += 29;
            }
        } else if (year % 400 == 0) {//闰年的判断
            for (int i = 1; i < yue; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    sumday2 += 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    sumday2 += 30;
                } else
                    sumday2 += 29;
            }
        } else {//平年的判断
            for (int i = 1; i < yue; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    sumday2 += 31;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    sumday2 += 30;
                } else
                    sumday2 += 28;
            }
        }
       // System.out.println(sumday1 + "   " + sumday2);
        int c = (sumday1 + sumday2) % 7;//得出所有所有天数的除以7的余数，是用余数计算计算第二个月的第一天
        System.out.println("   日  一   二  三  四  五  六");
        if (year % 4 == 0 && year % 100 != 0) {
            if (yue == 1 || yue == 3 || yue == 5 || yue == 7 || yue == 8 || yue == 10 || yue == 12) {
                number(c, 31);
            } else if (yue == 4 || yue == 6 || yue == 9 || yue == 11) {
                number(c, 30);
            } else
                number(c, 28);
        } else if (year % 400 == 0) {
            if (yue == 1 || yue == 3 || yue == 5 || yue == 7 || yue == 8 || yue == 10 || yue == 12) {
                number(c, 31);
            } else if (yue == 4 || yue == 6 || yue == 9 || yue == 11) {
                number(c, 30);
            } else
                number(c, 28);
        } else {
            if (yue == 1 || yue == 3 || yue == 5 || yue == 7 || yue == 8 || yue == 10 || yue == 12) {
                number(c, 31);
            } else if (yue == 4 || yue == 6 || yue == 9 || yue == 11) {
                number(c, 30);
            } else
                number(c, 28);
        }
    }

    public static void number(int a, int ab) {//判断时间年分，以星期一位1，星期二为2，

        int c = a;
        int ac = ab;
        for (int i1 = 0; i1 <= ab + c; i1++) {
            if (i1 - c <= 0) {
                System.out.print("    ");
            } else if (i1 % 7 == 6) {
                System.out.printf("%4d\n", i1 - c);
            } else
                System.out.printf("%4d", i1 - c);
        }
    }
}
