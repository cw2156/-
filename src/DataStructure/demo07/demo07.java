package DataStructure.demo07;

import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        YLinkList list=new YLinkList();

        Scanner scanner=new Scanner(System.in) ;
        int a=scanner.nextInt();
        for (int i = 0; i < a; i++) {
            Scanner scanner1=new Scanner(System.in);
            list.insert(scanner1.next());


        }
      /*  YLinkList list2=new YLinkList();
        Scanner scanner2=new Scanner(System.in) ;
        int a2=scanner.nextInt();
        for (int i = 0; i < a; i++) {
            Scanner scanner1=new Scanner(System.in);
            list2.insert(scanner1.next());


        }*/

       list.display();
       System.out.println("移除第二个元素");
        list.remove(2);
        list.display();
       System.out.println("添加第二个元素为40");
        list.insert(2,40);
        list.display();
        System.out.println("就地逆置");
        list.JDNZ();
        list.display();
        System.out.println("消除重复元素");
        list.duplicate();
        System.out.println("奇数偶数分离");
        list.JO();
        list.display();

    }
}
