package DataStructure.demo24;

import DataStructure.demo16.LinkQueue;
import DataStructure.demo19.GraphKind;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class MGraph  {
    public final static int INFINITY=0;
    private GraphKind kind;
    private int vexNum, arcNum;
    private Object[] vexs;
    private int [][] arcs;
    public MGraph(){
        this(null,0,0,null,null);
    }
    private boolean[] visited = null;

    public MGraph(GraphKind kind, int vexNum, int arcNum, Object[] vexs, int [][] arcs) {
        this.kind=kind;
        this.vexNum=vexNum;
        this.arcNum=arcNum;
        this.vexs=vexs;
        this.arcs=arcs;
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

    //创建无向图
    public void createGraph() {
     Scanner sc=new Scanner(System.in);
        System.out.println("请分别输入图的定点数，图的边数");
        vexNum= sc.nextInt();//顶点
        arcNum=sc.nextInt();
        vexs= new Object[vexNum];
        System.out.println("请分别输入图的各个顶点");
        for (int v=0;v<vexNum;v++)
            vexs[v]=sc.next();
        arcs=new int [vexNum][vexNum];
        for (int v=0;v<vexNum;v++)
            for (int u=0;u<vexNum;u++)
                arcs[v][u]=INFINITY;
        System.out.println("请输入各个边的两个顶点级");
        for (int k=0;k<arcNum;k++){
            int v=locateVex(sc.next());
            int u=locateVex(sc.next());
            arcs[v][u]=arcs[u][v]=1;
        }
    }
    public int locateVex(Object vex) {
        for(int v=0;v<vexNum;v++){
            if(vexs[v].equals(vex))
                return v;
        }
        return -1;
    }
    void printfGraph(MGraph G)//遍历列表
    {
        int i,j;
        System.out.print("  ");
        for(i=0;i<G.vexNum;i++)
        {
            System.out.print(G.vexs[i]);
        }
        System.out.println();
        for(i=0;i<G.vexNum;i++)
        {
            System.out.print(G.vexs[i]+" ");
            for(j=0;j<G.vexNum;j++)
            {
                System.out.print(G.arcs[i][j]);
            }
            System.out.println();
        }
    }
    public void dFSTraverse() {

        this.visited = new boolean[this.vexs.length];   //初始化访问标志数组
        for(int i = 0; i < this.visited.length; i++) {
            this.visited[i] = false;
        }

        for(int i = 0; i < this.visited.length; i++) {
            if(!this.visited[i]) {  //对未访问的顶点调用深度优先遍历算法
                dFS_AM(i);
            }
        }
    }
    public void dFS_AM(int site) {  //输入深度优先遍历的开始顶点
        System.out.println(this.vexs[site]);  //输出该顶点
        this.visited[site] = true;  //置访问标志为true
        for(int i = 0; i < this.vexs.length; i++) {   //依次查找未访问邻接点，并以该邻接点为始点调用深度优先遍历算法
            if(this.arcs[site][i] != 0 && !this.visited[i]) {
                this.dFS_AM(i);
            }
        }
    }
    public void bFSTraverse() {

        this.visited = new boolean[this.vexs.length];  //初始化访问标志数组
        for(int i = 0; i < this.visited.length; i++) {
            this.visited[i] = false;
        }

        for(int i = 0; i < this.visited.length; i++) {
            if(!this.visited[i]) {  //对未访问的顶点调用广度优先遍历算法
                bFS_AM(i);
            }
        }
    }
    public void bFS_AM(int site) {  //输入开始顶点
        System.out.println(this.vexs[site]);  //输出该顶点
        this.visited[site] = true;  //置访问标志为true
        LinkedList<Integer> linkedList = new LinkedList<Integer>();  //借助队列来实现广度优先遍历
        linkedList.offer(site);   //将访问过的顶点入队
        while(!linkedList.isEmpty()) {
            int vexSite = linkedList.poll();   //队头顶点出队
            for(int i = 0; i < this.vexs.length; i++) {
                if(this.arcs[vexSite][i] != 0 && !this.visited[i]) {  //依次查找未访问的邻接点进行访问后入队
                    System.out.println(this.vexs[i]);
                    this.visited[i] = true;
                    linkedList.offer(i);
                }
            }
        }
    }



}
