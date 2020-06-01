package Dome200201;

public class Dome_Overlod {
    public static void main(String[] args) {
        ps();
        ps(2);
        ps((float)0.2);
        ps((short)2);

    }

    public static int ps() {
        System.out.println("1");
        return 2;

    }

    public static int  ps(int a) {
        System.out.println("2");
        return  2;
    }

    public static void ps(double v) {
        System.out.println("3");
    }

    public static void ps( short b) {
        System.out.println("4");
    }
}
