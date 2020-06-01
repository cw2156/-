package Deme200215.deom01;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String str = arraytoString(arr);
        System.out.println(str);

    }

    public static String arraytoString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1) {
                s+="word"+arr[i]+"]";

            }else{
                s += "word" + arr[i] + "#";
            }

        }
        return s;


    }

}
