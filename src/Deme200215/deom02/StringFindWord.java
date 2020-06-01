package Deme200215.deom02;

import java.util.Scanner;

public class StringFindWord {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        System.out.println(str);
        numberFind(str);

    }

    public static void numberFind(String str) {
        int a = 0, b = 0, c = 0, d = 0;
        //str.charAt(i)
           // char[] chars=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {

            if ('A' <= str.charAt(i)&& str.charAt(i) <= 'Z') {
                a++;//大写字母

            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                b++;

            } else if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                c++;
                ;
            } else
                d++;

        }
        System.out.println("大写字母："+a+"小写字母："+b+"数字："+c+"其他："+d);
    }
}
