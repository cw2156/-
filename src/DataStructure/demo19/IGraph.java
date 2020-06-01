package DataStructure.demo19;

public interface IGraph {
    void createGraph();
    int getVexNum();
    int getArcNum();
    Object getVex(int v);
    int  locateVex(Object vex);
    int firstAdjVex(int v);
    int nextAdjVex(int v,int w);
}
