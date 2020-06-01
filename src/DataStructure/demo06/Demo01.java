package DataStructure.demo06;

import DataStructure.demo04.LinkList;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        LinkStack a=new LinkStack();
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        for (int i = 0; i < sc; i++) {
            Scanner scanner1=new Scanner(System.in);
            a.push(scanner1.next());

        }

        a.display();

    }
}
