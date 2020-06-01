package threeday20120;

public class OverloadExercise {
    public static void main(String[] args) {
        System.out.println(sum((byte)10,(byte)10));
        System.out.println(sum((short)10,(short)10));
        System.out.println(sum(10,10));
        System.out.println(sum(10l,10l));
    }

    public static boolean sum(byte a, byte b) {
        System.out.println("byte");
        boolean some;
        if (a == b) {
            some = true;

        } else
            some = false;
        return some;
    }

    public static boolean sum(short a, short b) {
        System.out.println("short");
        if (a == b)
            return true;
        else
            return false;

    }
    public static boolean sum(int a,int b){
        System.out.println("int");
        return a==b;
    }
    public static boolean sum(long a,long b){
        System.out.println("long");
        return a==b ? true:false;
    }
}
