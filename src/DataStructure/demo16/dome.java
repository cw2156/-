package DataStructure.demo16;

import java.util.Scanner;

public class dome {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        LinkQueue linkQueue = new LinkQueue();
        System.out.println("输入队列个数");
        int maxSize = scanner.nextInt();
        System.out.println("输入队列元素");
        for (int i = 0; i < maxSize; i++) {
            linkQueue.offer(scanner.next());
        }
        System.out.println("查看");
        System.out.println(linkQueue.peek());
        System.out.println("输出poll");
        for (int j = 0; j < maxSize;j++){
            System.out.print(linkQueue.poll() + " ");
        }

    }
}
