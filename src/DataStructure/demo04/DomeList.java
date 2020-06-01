package DataStructure.demo04;

import java.util.Scanner;

public class DomeList {
    public static void main(String[] args) throws Exception {
        LinkList acg=new LinkList();
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i = 0; i < a; i++) {
            Object object=scanner.next();
            acg.insert(object);
        }
        acg.display();
        acg.JO();


     /*   LinkList acg=new LinkList();
        LinkList acg1=new LinkList();
        acg.insert(20);
        acg.insert(30);
        acg.insert(40);
        acg1.insert(20);
        acg1.insert(30);
        acg1.insert(40);
        System.out.println("显示数据长度");
        System.out.println(acg.length());
        System.out.println("遍历第一个链数据内容");
        acg.display();
        System.out.println("遍历第二个链数据内容");
        acg1.display();
        System.out.println("移除第一个链的第二位置的内容");
        acg.remove(2);
        acg.display();
        System.out.println("查找第一个链中内容为20的位置");
        System.out.println(acg.indexOf(20));
        System.out.println("在第二个位置插入70");
        acg.insert(2,70);
        acg.display();
        System.out.println("两个链的链接");
        acg.connect(acg1);
        acg.display();*/

    }

}
