package DataStructure.demo18;

import java.util.Scanner;

class dome {

//    public static BiTree createTree() {   //创建树
//        BiTreeNode L = new BiTreeNode('L');
//        BiTreeNode G = new BiTreeNode('G', null, L);
//        BiTreeNode H = new BiTreeNode('H');
//        BiTreeNode D = new BiTreeNode('D', G, H);
//        BiTreeNode I = new BiTreeNode('I');
//        BiTreeNode E = new BiTreeNode('E', null, I);
//        BiTreeNode B = new BiTreeNode('B', D, E);
//        BiTreeNode J = new BiTreeNode('J');
//        BiTreeNode K = new BiTreeNode('K');
//        BiTreeNode F = new BiTreeNode('F', J, K);
//        BiTreeNode C = new BiTreeNode('C', null, F);
//        BiTreeNode A = new BiTreeNode('A', B, C);
//        return new BiTree(A);
//    }

    public static void main(String[] args) {
       // BTree biTree = new BTree();
       // Scanner scanner = new Scanner(System.in);
        BTree ts =new BTree("ABDGLHEICFJK","GLDHBEIACJFK",0,0,12);
        System.out.println("前序遍历输入一颗二叉树");
       // BTree ts = new BTree(scanner.next());
        BTNode node = ts.root;
        System.out.println("中序遍历");
        ts.LDR(node);
        System.out.println();
        System.out.println("叶子节点个数" + ts.leafNum(ts.root));
        System.out.println("树的深度" + ts.biTreedepth(ts.root));

    }
}

