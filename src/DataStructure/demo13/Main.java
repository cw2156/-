package DataStructure.demo13;


import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws Exception{
        System.out.println("初始化【顺序】队列结点...");
        System.out.print("输入【顺序】队列结点个数:");
        /*---------------------------------------*/
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //因为有一个位置是空的，所以最大有效数据是N-1
        CircleSqQueue circleSqQueue = new CircleSqQueue(N);
        for(int i=1;i<N;i++)
            circleSqQueue.offer(i);
        /*---------------------------------------*/
        System.out.println("初始化后，【顺序】队列结点元素:");
        circleSqQueue.display();
        System.out.println("\n【顺序】队列元素个数："+circleSqQueue.length());
        /*---------------------------------------*/
        System.out.println("\n【顺序】队列功能测试...");
        System.out.println("获取【顺序】队列队首元素："+circleSqQueue.peek());
        System.out.println("此时【顺序】队列是否为空队："+circleSqQueue.isEmpty());
        /*---------------------------------------*/
        System.out.println("执行出队功能（出队2次）...");
        int QueueOutNum = circleSqQueue.poll();
        System.out.println("出队元素："+QueueOutNum);
        int QueueOutNum1 = circleSqQueue.poll();
        System.out.println("出队元素："+QueueOutNum1);
        /*---------------------------------------*/
        System.out.println("出队后，【顺序】队列剩余结点元素:");
        circleSqQueue.display();
        /*---------------------------------------*/
        System.out.println("\n【顺序】队列元素个数："+circleSqQueue.length());
        /*---------------------------------------*/
        System.out.println("【顺序】队列清空操作...");
        circleSqQueue.clear();
        /*---------------------------------------*/
        System.out.println("【顺序】队列清空后，判断队列是否为空："+circleSqQueue.isEmpty());
        System.out.println("【顺序】队列元素个数："+circleSqQueue.length());
        System.out.println("清空队队后，【顺序】队列剩余结点元素:");
        circleSqQueue.display();
        /*---------------------------------------*/
        System.out.print("\n---【顺序】队列功能执行完毕---");
    }
}
