package Dome20122;

import java.lang.reflect.Array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] ArrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int t = 0;
        for (int i = 0; i < (ArrayA.length / 2); i++) {
            t = ArrayA[i];
            ArrayA[i] = ArrayA[ArrayA.length - (i + 1)];
            ArrayA[ArrayA.length - (i + 1)] = t;

        }
        printArray(ArrayA);

        }



    public static void printArray(int [] ArrayA){
        for (int i = 0; i < ArrayA.length; i++) {
            System.out.println(ArrayA[i]);
    }
}
}
