package Dome20122;

public class ArrayMin {
    public static void main(String[] args) {
        int [] ArrayA={01,02,03,04,05};
        int maxA=ArrayMaxA(ArrayA);
        System.out.println("最大是"+maxA);

    }
    public static int ArrayMaxA(int [] A){
        int min=A[0];
        for (int i = 1; i < A.length; i++) {
            if(min>A[i]){
                min=A[i];
            }




        }
        return min;

    }

}
