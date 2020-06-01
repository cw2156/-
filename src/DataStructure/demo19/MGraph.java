package DataStructure.demo19;

import DataStructure.demo16.LinkQueue;
import Dome200201.G_S;

import java.util.Scanner;

public class MGraph implements IGraph {
    public final static int INFINITY=Integer.MAX_VALUE;
    private GraphKind kind;
    private int vexNum, arcNum;
    private Object[] vexs;
    private int [][] arcs;
    public MGraph(){
        this(null,0,0,null,null);
    }

    public MGraph(GraphKind kind, int vexNum, int arcNum, Object[] vexs, int [][] arcs) {
        this.kind=kind;
        this.vexNum=vexNum;
        this.arcNum=arcNum;
        this.vexs=vexs;
        this.arcs=arcs;
    }

    @Override
    public void createGraph() {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入图的类型");
        GraphKind king=GraphKind.valueOf(sc.next());
        switch(kind){
            case UDG:
                createUDG();
                return;
            case DG:
                createDG();
                return;
            case UDN:
                createUDN();
                return;
            case DN:
                createDN();
                return;


        }


    }
    public void createUDG(){}
    public void createDG(){}
    public void createUDN(){}
    public void  createDN() {}

    @Override
    public int getVexNum() {
        return 0;
    }

    @Override
    public int getArcNum() {
        return 0;
    }

    @Override
    public Object getVex(int v) {
        return null;
    }

    @Override
    public int locateVex(Object vex) {
        return 0;
    }

    @Override
    public int firstAdjVex(int v) {
        return 0;
    }

    @Override
    public int nextAdjVex(int v, int w) {
        return 0;
    }
    private static boolean[] visited;

}
