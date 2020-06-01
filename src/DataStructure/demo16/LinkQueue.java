package DataStructure.demo16;


public class LinkQueue implements IQueue {
    Node first;
    Node rear;
    public LinkQueue(){
        first = rear =null;
    }
    @Override
    public void clear() {
        first = rear = null;
    }

    @Override
    public boolean isEmpty() {
        return rear == null;
    }

    @Override
    public int length() {
        Node p = first;
        int j = 1;
        while (p != null){
            p = p.next;
            j++;
        }
        return j;
    }

    @Override
    public Object peek() {
        if (first != null){
            return first.data;
        }
        else return null;
    }

    @Override
    public void offer(Object x) throws Exception {
        Node p = new Node(x);
        if (first == null){
            first = rear = p;
        }
        else{
            rear.next = p;
            rear = p;
        }
    }

    @Override
    public Object poll() {
        if (first != null){
            Node p = first;
            first = first.next;
            return p.data;
        }
        else return null;
    }
    public void display(){
        Node p = first;
        while (p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
}
