package DataStructure.demo20;

public class BiTreeNode {////数据节点设计
    public Object data;//结点的数据域
    public BiTreeNode lchild ,rchild;//左右孩子域
    //构建一个结点
    public BiTreeNode(){
        this(null);
    }
    //构建一个左右孩子为空的二差数
    public BiTreeNode(Object  data){
        this(data,null,null);
    }
    //够造一棵数据域和左右孩子域都不为空的二叉树
    public BiTreeNode(Object data,BiTreeNode lchild ,BiTreeNode rchild){
        this.data=data;
        this.lchild=lchild;
        this.rchild=rchild;
    }
}
