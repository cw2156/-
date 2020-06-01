package DataStructure.demo23;

//单链表
//单链表的结点，节点
public class Node {
    //存储的数据
    Object date;
    //下一个节点
    Node next;

    public Node(Object date) {
        super();
        this.date = date;

    }

    public Node(Object date, Node next) {
        super();
        this.date = date;
        this.next = next;
    }
    public Node(){

    }
    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
