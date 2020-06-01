    package DataStructure.demo25;

    public class exercise {
        public static void main(String[] args) throws Exception {
            ALGrapking al=new ALGrapking();
            al.createGraph();
           // System.out.println("广度优先遍历");
          //  al.BFSTraverse(al);
            System.out.println("深度优先遍历");
           al.DFSTraverse(al);
            System.out.println("拓扑排序");
            boolean a=al.topologicalSort(al);
            System.out.println(a);
        }

    }
