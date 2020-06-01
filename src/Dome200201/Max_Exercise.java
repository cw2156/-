package Dome200201;

public class Max_Exercise {
    public static void main(String[] args) {
        int [] Array={1,2,3,4,5};
        int Max=Max(Array);
        System.out.println(Max);

    }

    public static int  Max(int [] Array){
        int max=Array[0];
        for (int i=0;i<5;i++){
            if(max<Array[i]){
                max=Array[i];
            }
        }
        return max;

    }
}
