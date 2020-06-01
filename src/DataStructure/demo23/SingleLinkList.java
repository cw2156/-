package DataStructure.demo23;

import java.util.Arrays;

public class SingleLinkList {
    //不存储数据，头节点
    private Node head;
    //一共有几个节点
    private int size;
  public  SingleLinkList()
   {
       head=new Node();
       size=0;
   }

    //返回单链表长度
    public int size() {

       return size;
    }

    //单链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //获取i处的值
    public Object get(int i) {
        //不能通过索引计算定位，需要从头结点逐个查找
        Node p=head;
        for (int j=0;j<i;j++){
            p = p.next;
        }
        return p.date;
    }

    //添加到最后
    public void add(Object e){
        this.add(size,e);
    }
    //添加到i处
    public void add(int i,Object e){
       Node p=head;
       for(int j =0;j<i;j++)
           p = p.next;
       //创建新节点
       Node NewNode=new Node();
       //指明新节点的后继节点
       NewNode.next=p.next;
       NewNode.date=e;
       //指明新节点前驱节点
       p.next=NewNode;
       size++;
    }








}

