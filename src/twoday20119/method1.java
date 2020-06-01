package twoday20119;

public class method1 {
    public static void main(String[] args) {
    method1_1(10,10);
        System.out.println("==================");
        method1_2();
    }

    public static void method1_1(int a,int b) {

        int i=a+b;
        System.out.println("结果是"+i);
    }

    public static void method1_2(){
        for (int i=0;i<10;i++){
            System.out.println("HelloWord"+i);
        }

    }
}
