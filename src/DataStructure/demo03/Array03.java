package DataStructure.demo03;

public class Array03 {
    public static void main(String[] args)  {
        System.out.println("插入5个元素");
        Array02 list=new Array02(5);
        list.insert(0,5);
        list.insert(1,10);
        list.insert(2,20);
        list.insert(3,30);
        list.insert(4,40);

        list.display();
        System.out.println("查找数字为30的位置");
        System.out.println(list.indexOf(30));
         System.out.println("查找位置为4的数据");
        System.out.println(list.get(4));
        System.out.println("移除位置为2的数据");
        list.remove(2);
        list.display();
        System.out.println("移除10");
        list.delete(10);
        list.display();










    }
}
