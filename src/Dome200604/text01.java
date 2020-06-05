package Dome200604;
//验证打印1--9999多场时间
public class text01 {
    public static void main(String[] args) {
        long a=System.currentTimeMillis();
        System.out.println(a);
       for (int i = 0; i < 9999; i++) {
            System.out.print("");

        }
       long b=System.currentTimeMillis()-a;
        System.out.println(b);

    }
}
