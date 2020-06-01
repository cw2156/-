package demo23__4;


//二叉树链表的结点


public class Node {
    Object date;
    Node rightChild;
    Node leftChild;
    public Node(){
        this(null);
    }
    public Node(Object  data){
        this(data,null,null);
    }
    public Node(Object date, Node leftChild, Node rightChild) {
        this.date = date;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
