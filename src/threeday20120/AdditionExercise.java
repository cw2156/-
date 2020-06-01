package threeday20120;

public class AdditionExercise {
    public static void main(String[] args) {

        System.out.println("输出结果是" + SumMethod());
    }

    public static int SumMethod() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;

        }
        return sum;

    }
}
