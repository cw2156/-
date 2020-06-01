package DataStructure.demo12;


import java.util.Scanner;
public class Main_LinkQueue {
    public static void main(String[] args) throws Exception {
        LinkQueue linkQueue = new LinkQueue();
        System.out.println("初始化【链】队列结点...");
        System.out.print("输入【链】队列结点个数:");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1;i<=N;i++)
            linkQueue.offer(i);
        /*---------------------------------------*/
        System.out.println("遍历初始化【链】队列结点元素:");
        linkQueue.display();
        /*---------------------------------------*/
        System.out.println("\n【链】队列功能测试...");
        System.out.println("【链】队列大小："+linkQueue.size());
        System.out.println("获取【链】队列队首元素："+linkQueue.peek());
        System.out.println("此时【链】队列是否为空队："+linkQueue.isEmpty());
        /*---------------------------------------*/
        System.out.println("执行出队功能（出队一次）:");
        linkQueue.poll();
        /*---------------------------------------*/
        System.out.println("出队一次后，【链】队列剩余结点元素:");
        linkQueue.display();
        /*---------------------------------------*/
        System.out.println("\n【链】队列大小："+linkQueue.size());
        /*---------------------------------------*/
        System.out.println("【链】队列清空");
        linkQueue.clear();
        /*---------------------------------------*/
        System.out.println("【链】队列清空后，判断队列是否为空："+linkQueue.isEmpty());
        System.out.println("【链】队列大小："+linkQueue.size());
        /*---------------------------------------*/
        System.out.print("---【链】队列功能执行完毕---");
    }
}
