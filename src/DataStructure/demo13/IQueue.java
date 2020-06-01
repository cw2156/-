package DataStructure.demo13;

public interface IQueue {
    public void clear();
    public boolean isEmpty();
    public boolean isFull();
    public int length();
    public int peek();
    public void offer(int x) throws Exception;
    public int poll();
    public void display();

}
