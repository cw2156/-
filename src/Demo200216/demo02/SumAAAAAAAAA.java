package Demo200216.demo02;

import Dome20122.Array01;
import org.xml.sax.ext.Attributes2;

import java.util.Scanner;

public class SumAAAAAAAAA {
    public static void main(String[] args) {
        Scanner A1=new Scanner(System.in);
        System.out.println("请输入各位数");
        int A= A1.nextInt();
        Scanner A2=new Scanner(System.in);
        System.out.println("请输入相位数");
        int A21= A2.nextInt();
        int sum=A;
        int sums=A;
        for (int i = 1; i < A21; i++) {//循环8次相当于加8个0
            sum=10*sum+A;

            System.out.println(sum);
            sums+=sum;

        }
        System.out.println(sums);

    }
}
