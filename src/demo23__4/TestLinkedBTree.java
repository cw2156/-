package demo23__4;

public class TestLinkedBTree {
    public static void main(String[] args) {
        //创建一个二叉树
        /*Node node5 = new Node(5, null, null);
        Node node4=new Node(4,null,node5);
        Node node3=new Node(3,null,null);
        Node node7=new Node(7,null,null);
        Node node6=new Node(6,null,node7);
        Node node2=new Node(2,node3,node6);
        Node node1=new Node(1,node4,node2);*/
        Node node3=new Node(3,null,null);
        Node node2=new Node(2,null,null);
        Node node1=new Node(1,node2,node3);
        LinkedBTree bTree = new LinkedBTree(node1);
        System.out.println(bTree.isEmpty());
        bTree.postOrderTraverse(node1);
    }
}
