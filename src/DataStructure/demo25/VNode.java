package DataStructure.demo25;

public class VNode {
    public Object data;
    public ArcNode firstArc;

    public VNode() {
        this(null);
    }

    public VNode(Object data) {
        this(data,null);
    }

    public VNode(Object data, ArcNode firstArc) {
        this.data = data;
        this.firstArc = firstArc;
    }
}
