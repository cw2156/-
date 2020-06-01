package demo23__4;



public class LinkedBTree {
    //根节点
    private Node root;
  /*  LinkedBTree leftBTree = new LinkedBTree(root.leftChild);
    LinkedBTree rightBTree = new LinkedBTree(root.rightChild);*/

    public LinkedBTree() {
        this(null);//

    }

    public LinkedBTree(Node root) {

        this.root = root;

    }

    //二叉树是否为空
    public boolean isEmpty() {

        return root == null;
    }

    //先序遍历
    public void preOrderTraverse() {
        System.out.println("前序遍历");
        this.preOrderTraverse(root);
        System.out.println();
    }

    private void preOrderTraverse(Node root) {
        if (root != null) {
            //输出根节点的值
            System.out.println(root.date + "  ");
            //对左子树进行遍历
            this.preOrderTraverse(root.leftChild);
            //对右子树进行遍历
            this.preOrderTraverse(root.rightChild);
        }
    }


    public void inOrderTraverse(){
        System.out.println("中序遍历");
        this.inOrderTraverse(root);
        System.out.println();
    }
    private void inOrderTraverse(Node root){
        if (root!=null){
            this.inOrderTraverse(root.leftChild);
            System.out.println(root.date+"  ");
            this.inOrderTraverse(root.rightChild);
        }
    }

    public void postOrderTraverse(){
        Node root1=root;
        System.out.println("后序遍历");
        this.postOrderTraverse(root1);
       // System.out.println();
    }

   public   void postOrderTraverse(Node root){
        if(root != null){
            this.postOrderTraverse(root.leftChild);
            this.postOrderTraverse(root.rightChild);
            System.out.println(root.date+"  ");
        }
    }
}