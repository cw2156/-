package DataStructure.demo15;

import java.util.Scanner;

public class dome {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入队列个数");
        int maxSize = scanner.nextInt();
        SqStack sqStack = new SqStack(maxSize+1);
        System.out.println("输入队列元素");
        for (int i = 0; i < maxSize; i++){
            sqStack.offer(scanner.next());
        }
        System.out.println("查看");
        System.out.println(sqStack.peek());
        System.out.println("输出poll");
        for (int j = 0; j < maxSize;j++){
            System.out.print(sqStack.poll()+" ");
        }

    }

}
