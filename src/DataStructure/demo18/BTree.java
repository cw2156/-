package DataStructure.demo18;

public class BTree {

        public BTNode root;

        public BTree() {
            this.root = null;
        }

        public BTree(BTNode root) {
            this.root = root;
        }

        static int index = 0;

        public BTree(String s) {
            if (index < s.length()) {
                char c = s.charAt(index++);

                if (c != '#') {
                    root = new BTNode(c);
                    root.lChild = new BTree(s).root;
                    root.rChild = new BTree(s).root;
                } else {
                    root = null;
                }
            }
        }

        public int leafNum(BTNode x) {
            if (x == null) {
                return 0;
            } else {
                int lNum = leafNum(x.lChild);
                int rNum = leafNum(x.rChild);
                if (x.rChild == null && x.lChild == null) {
                    return lNum + rNum + 1;
                } else
                    return lNum + rNum;
            }
        }

        public int biTreedepth(BTNode t) {
            if (t == null) {
                return 0;
            }
            int i = biTreedepth(t.lChild);
            int j = biTreedepth(t.rChild);
            return (i < j) ? j + 1 : i + 1;
        }

        public BTree(String preOrder, String inOrder, int preIndex, int inIndex,
                      int count) {
            if (count > 0) {
                char r = preOrder.charAt(preIndex);
                int i = 0;
                for (; i < count; i++)
                    if (r == inOrder.charAt(i + inIndex)) {
                        System.out.println(r + " " + (i + inIndex) + " " + preIndex + " " + inIndex + " " + count + " ");
                        break;
                    }
                root = new BTNode(r);
                root.setlChild(new BTree(preOrder, inOrder, preIndex + 1, inIndex,
                        i).root);
                root.setrChild(new BTree(preOrder, inOrder, preIndex + i + 1,
                        inIndex + i + 1, count - i - 1).root);
            }
        }


        public void DLR(BTNode x) {
            if (x != null) {
                System.out.print(x.data);
                DLR(x.lChild);
                DLR(x.rChild);
            }
        }

        public void LDR(BTNode x) {
            if (x != null) {

                LDR(x.lChild);
                System.out.print(x.data);
//            i++;
                LDR(x.rChild);
            }
        }

        public void LRD(BTNode x) {
            if (x != null) {
                LRD(x.lChild);
                LRD(x.rChild);
                System.out.print(x.data);
            }
        }
    }


