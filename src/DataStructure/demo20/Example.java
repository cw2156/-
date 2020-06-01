package DataStructure.demo20;

public class Example {//////应用函数
    public static void main(String[] args) {
        /*String preOrder="ADBEGCFH";
        String inOrder="DBGEAFHC";
        BiTree T=new BiTree(preOrder,inOrder ,0,0,preOrder.length());
        System.out.println("后根遍历");
        BiTreeNode sa=T.getRoot();
        T.postRootTracerse(sa);*/
        String preStr="ABD##EG###CF#H###";
        System.out.println("ABD##EG###CF#H###------先续输入序列");
        BiTree T=new BiTree(preStr);
        System.out.println("先根遍历");
        BiTreeNode sa=T.getRoot();
        T.preRootTraverse(sa);
        System.out.println("设计算法求二叉树的结点个数");
        System.out.println(T.countNode(sa));
        System.out.println("前序次序打印二叉树中的叶子结点。");
        T.countNodePrint(sa);

    }
}
