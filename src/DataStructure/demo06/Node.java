package DataStructure.demo06;

public class Node {
    private Node frist;
    private Object data;
    private Node next;
    public Node getFrist() {
        return frist;
    }

    public void setFrist(Node frist) {
        this.frist = frist;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public Node(Object data) {

        this.data = data;

    }




}
