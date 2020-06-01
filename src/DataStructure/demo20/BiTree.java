package DataStructure.demo20;

import DataStructure.demo06.LinkStack;

public class BiTree {
    private BiTreeNode root;//树的根结点
    public BiTree(){//够造一颗空树
        this.root=null;
    }
    public BiTree(BiTreeNode root){ //够造一个树
        this.root=root;
    }
    //由表明空指数先根遍历序列建立一颗二叉树并返回起根结点
    public BiTree(String preStr){
        char c=preStr.charAt(index++);
        if(c!='#'){
            root=new BiTreeNode(c);
            root.lchild=new BiTree(preStr).root;
            root.rchild=new BiTree(preStr).root;

        }else
            root=null;
    }
    //由先根遍历和中根遍历程序创建一颗二叉树的算法
    public BiTree(String preOrder,String inOrder,int preIndex,int inIndex,int count){
    if (count>0){
    char r=preOrder.charAt(preIndex);//取先根遍历序中的第一个节点做为根节点
    int i=0;
    for(; i<count;i++){
        if(r==inOrder.charAt(i+inIndex))
            break;
        root =new BiTreeNode(r);
        root.lchild=new BiTree(preOrder,inOrder,preIndex+1,inIndex,i).root;
        root.rchild=new BiTree(preOrder,inOrder,preIndex+i+1,inIndex+i+1,count-i-1).root;
    }
}
    }
    //由表明空子树的先根遍历序列创建一颗二叉树的算法
    public static int index=0;
    public void preRootTravers(BiTreeNode T ){



    }
    //先根遍历二叉树的递归算法
    public void preRootTraverse(BiTreeNode T){
        if(T!=null){
            System.out.print(T.data);
            preRootTraverse(T.lchild);
            preRootTraverse(T.rchild);
        }
    }
    //先根遍历二叉树非递归算法
    public void preRootTraverse(){}
    //中根遍历二叉树的递归算法
    public void inRootTracerse(BiTreeNode T){
        if(T!=null){
            inRootTracerse(T.lchild);
            System.out.print(T.data);
            inRootTracerse(T.rchild);
        }
    }
    //中根遍历的非递归算法
    public void InRootTracerse(){}
    //后根遍历的递归算法
    public void postRootTracerse(BiTreeNode T){
        if(T!=null){
            postRootTracerse(T.lchild);
            postRootTracerse(T.rchild);
            System.out.print(T.data);
        }

    }
//后根遍历的非递归算法
public void postRootTracerse(){
/*BiTreeNode T=root;
if(T!=null){
    LinkStack S=new LinkStack();
    S.push(T);
    Boolean flag;

}*/
}
//层次遍历二叉树的算法（左到右）
    public void levelTraverse(){}
    public BiTreeNode getRoot(){
        return root;
    }
    public void setRoot(BiTreeNode root){
        this.root=root;
    }
    //统计二叉树中节点个数的算法
    public int  countNode (BiTreeNode T) {
        int count = 0;
        if (T != null) {
            ++count;
            count += countNode(T.lchild);
            count += countNode(T.rchild);
        }
        return count;
    }
    //按前序打印二叉树叶子节点
    public void countNodePrint(BiTreeNode T){
        if(T!=null){
            if(T.rchild==null&&T.lchild==null){
                System.out.println(T.data);
            }
            else{
                countNodePrint(T.lchild);
                countNodePrint(T.rchild);
            }
        }

    }

}
