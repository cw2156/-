package twoday20119;

public class method {
    public static void main(String[] args) {
        //赋值调用
        int c = sum(12, 23);
        System.out.println(c);
        //打印调用
        System.out.println(sum(12, 23));
        //直接调用
        sum(12, 23);
        //void 的返回值类型只能用单独调用不能用于打印调用和赋值调用
    }

    public static int sum(int a, int b) {
        System.out.println("运行了方法");
        int reutrn = a + b;
        return reutrn;

    }
}
