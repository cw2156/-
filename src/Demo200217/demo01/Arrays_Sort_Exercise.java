package Demo200217.demo01;

import java.util.Arrays;

/*
 *字符串排序问题将字符串升序排列并，并且倒序打印出来。
 * 应用到：
 * public static void sort(数组);数组排序
 *
 *
 *  */
public class Arrays_Sort_Exercise {
    public static void main(String[] args) {
        String line = "askdjfhsadkhfuvhbpaweih";
        char[] line1 = line.toCharArray();
        Arrays.sort(line1);
        for (int i = line1.length-1; i >= 0; i--) {
            System.out.print(line1[i]);
        }
        String line3=Arrays.toString(line1);
        //String line4=line1.toString();
        System.out.println(line3);
        //System.out.println(lint4);
    }
}
