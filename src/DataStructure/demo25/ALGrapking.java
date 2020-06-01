package DataStructure.demo25;

import DataStructure.demo06.LinkStack;
import DataStructure.demo16.LinkQueue;
import DataStructure.demo19.GraphKind;
import DataStructure.demo24.MGraph;

import java.util.Arrays;
import java.util.Scanner;

public class ALGrapking {
    public final static int INFINITY=0;
    private GraphKind kind;
    private int vexNum,arcNum;
    private VNode[] vexs;
    private  static boolean[] visited ;




    public VNode[] getVexs() {
        return vexs;
    }

    public void setVexs(VNode[] vexs) {
        this.vexs = vexs;
    }

    public int getVexNum() {
        return vexNum;
    }

    public void setVexNum(int vexNum) {
        this.vexNum = vexNum;
    }

    public int getArcNum() {
        return arcNum;
    }

    public void setArcNum(int arcNum) {
        this.arcNum = arcNum;
    }

    public ALGrapking(){
        this(null,0,0,null);
    }

    public ALGrapking(GraphKind kind, int vexNum, int arcNum, VNode[] vexs) {
        this.kind = kind;
        this.vexNum = vexNum;
        this.arcNum = arcNum;
        this.vexs = vexs;
    }

    public void createGraph() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别输入图的定点数，图的边数");
        vexNum = sc.nextInt();//顶点
        arcNum = sc.nextInt();
        vexs = new VNode[vexNum];
        System.out.println("请分别输入图的各个顶点");
        for (int v = 0; v < vexNum; v++)
            vexs[v] = new VNode(sc.next());
        System.out.println("请输入各边的定点");
        for (int k = 0; k < arcNum; k++) {
            int v = locateVex(sc.next());
            int u = locateVex(sc.next());
            addArc(v, u);
        }

    }public void addArc(int v ,int u){
        ArcNode arc=new ArcNode(u);//是头
        arc.nextArc=vexs[v].firstArc;
        vexs[v].firstArc=arc;
    }
   public Object getVex(int v)throws  Exception{
        if(v<0 && v>=vexNum)
            throw new Exception("第"+v+"定点不存在");
        return vexs[v].data;
    }
    public int locateVex(Object vex) {
        for(int v=0;v<vexNum;v++){
            if(vexs[v].data.equals(vex))
                return v;
        }
        return -1;

    }

    //广度遍历
    public  void BFSTraverse(ALGrapking G) throws Exception {
        visited =new boolean[G.getVexNum()];//访问}
        for (int v=0;v<G.getVexNum();v++){
            visited[v]=false;
        }
        for (int v=0;v<G.getVexNum();v++)
            if(!visited[v])
                 BFS(G,v);
    }
    private   void BFS(ALGrapking G , int v) throws Exception {
        visited[v]=true;
        System.out.println(G.getVex(v).toString()+"");
        LinkQueue Q=new LinkQueue();
        Q.offer(v);
        while(!Q.isEmpty()){
            int u = (Integer)Q.poll();
            for (int w =G.firstAdjVex(u);w>=0;w=G.nextAdjVex(u,w))
                if(!visited[w]){
                    boolean[] wisited;
                    visited[w]=true;
                    System.out.println(G.getVex(w).toString()+"");
                    Q.offer(w);
                }
        }
    }

    private int nextAdjVex(int v, int w)throws Exception {
        if(v<0 && v>=vexNum)
            throw new Exception("第"+v+"定点不存在");
        VNode vex=vexs[v];
        ArcNode arcvw=null;
        for (ArcNode arc=vex.firstArc;arc!=null;arc=arc.nextArc)
            if(arc.adjVex==w){
                arcvw=arc;
                break;
            }
        if(arcvw!=null && arcvw.nextArc!=null)
            return arcvw.nextArc.adjVex;
        else
            return -1;
    }

    public int firstAdjVex(int v) throws Exception{
        if(v<0&&v>=vexNum)
            throw new Exception("第"+v+"定点不存在");

    VNode vex=vexs[v];
    if(vex.firstArc!=null)
        return vex.firstArc.adjVex;
    else
        return -1;


    }
    //深度优先遍历
    public  void DFSTraverse(ALGrapking G)throws Exception{
        visited =new boolean[G.getVexNum()];;
        for (int v=0;v<G.getVexNum();v++)
            visited[v]=false;
        for (int v=0;v<G.getVexNum();v++)
            if(!visited[v])
                DFS(G,v);
    }
    public  void DFS(ALGrapking G,int v)throws Exception{
        visited[v]=true;
        System.out.println(G.getVex(v).toString()+" ");
        for (int w=G.firstAdjVex(v);w>=0;w=G.nextAdjVex(v,w))
            if(!visited[w])
                DFS(G,w);
    }


//拓扑排序
public static int[] findInDegree(ALGrapking G) throws Exception{
    int[] indegree = new int[G.getVexNum()];
    for (int i =0;i<G.getVexNum();i++)
        for (ArcNode arc = G.getVexs()[i].firstArc;arc!=null;arc=arc.nextArc)
            ++indegree[arc.adjVex];
    return indegree;
}
    public  boolean topologicalSort(ALGrapking G) throws Exception{
        int count = 0;
        int[] indegree = findInDegree(G);
        LinkStack S = new LinkStack();
        for(int i=0; i<G.getVexNum();i++)
            if(indegree[i]==0)
                S.push(i);
        while(!S.isEmpty()){
            int i = (Integer)S.pop();
            System.out.print(G.getVex(i)+"");
            ++count;
            for(ArcNode arc =G.getVexs()[i].firstArc;arc!=null;arc = arc.nextArc){
                int k = arc.adjVex;
                if(--indegree[k] == 0)
                    S.push(k);
            }
        }
        if(count<G.getVexNum())
            return false;
        else
            return true;
    }
}