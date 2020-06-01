package DataStructure.demo21;

public class BiTreeNode {

        public Object data;//结点的数据域
        public DataStructure.demo20.BiTreeNode lchild ,rchild;//左右孩子域
        //构建一个结点
        public BiTreeNode(){
            this(null);
        }
        //构建一个左右孩子为空的二差数
        public BiTreeNode(Object  data){
            this(data,null,null);
        }
        //够造一棵数据域和左右孩子域都不为空的二叉树
        public BiTreeNode(Object data, DataStructure.demo20.BiTreeNode lchild , DataStructure.demo20.BiTreeNode rchild){
            this.data=data;
            this.lchild=lchild;
            this.rchild=rchild;
        }
    }
