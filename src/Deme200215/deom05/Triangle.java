package Deme200215.deom05;

import javax.swing.*;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        for (int i = 0; i < s; i++) {//列
            int c = 0;
            for (int j = 0; j < (s - i); j++) {//行

                if (j == s - (i + 1)) {
                    //System.out.println("*");
                    print__(i + 1);
                    System.out.println();

                } else
                    System.out.print(" ");

            }


        }


    }

    public static void print__(int a) {
        int s = a;
        for (int b = 0; b < s; b++) {
            if (b == s - 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                System.out.print(" ");
            }


        }
    }

}

