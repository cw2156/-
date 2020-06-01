package DataStructure.demo24;

public class exercise {
    public static void main(String[] args) {
        MGraph a=new MGraph();
        a.createGraph();
        a.printfGraph(a);
        System.out.println("深度");
        a.dFSTraverse();
        System.out.println("广度");
        a.bFSTraverse();
    }
}
