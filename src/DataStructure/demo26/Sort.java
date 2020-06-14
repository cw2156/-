package DataStructure.demo26;

import com.mysql.cj.result.SqlDateValueFactory;

public class Sort {
    public static void main(String[] args) throws Exception {
        SeqList sq=new SeqList(6);
        sq.insert(0,new RecordNode(1 ,1));
        sq.insert(1,new RecordNode(10 ,10));
        sq.insert(2,new RecordNode(5 ,5));
        sq.insert(3,new RecordNode(15 ,15));
        sq.insert(4,new RecordNode(2 ,2));
        sq.insert(5,new RecordNode(14 ,14));
        System.out.println(sq.length());
        sq.print();
        System.out.println("直接插入排序");
        sq.insertSort();
        sq.print();
        System.out.println("冒泡排序");
        sq.bubbleSort();
        sq.print();
        System.out.println("快速排序");
        sq.Partition( 0, 6);
        sq.print();
        System.out.println("简单的选择排序");
        sq.selectSort();
        sq.print();

    }


}

