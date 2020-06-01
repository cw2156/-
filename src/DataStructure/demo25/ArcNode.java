package DataStructure.demo25;

public class ArcNode {
    public int adjVex;
    public  ArcNode nextArc;
    public ArcNode(){
        this(-1,null);

    }
    public ArcNode(int adjVex){
        this(adjVex,null);
    }

    public ArcNode(int adjVex,  ArcNode nextArc) {
        this.adjVex = adjVex;

        this.nextArc = nextArc;
    }
}
