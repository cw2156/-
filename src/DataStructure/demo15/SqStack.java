package DataStructure.demo15;



public class SqStack implements IQueue {
    private int front;
    private int rear;
    private Object []stackElem;
    public SqStack(int maxSize){
        //front = (front+1)%stackElem.length;
        stackElem = new Object[maxSize];
    }



    @Override
    public void clear() {
        front = rear ;
    }

    @Override
    public boolean isEmpty() {
        return (rear + 1)%stackElem.length == front;
    }

    @Override
    public int length() {
        return (rear - front + stackElem.length)%stackElem.length;
    }

    @Override
    public Object peek() {
        return stackElem[front];
    }


    @Override
    public void offer(Object x) throws Exception {
        if ((rear + 1)%stackElem.length == front){
            System.out.println("队列满");
        }
        else {
            stackElem[rear] = x;
            rear = (rear + 1) % stackElem.length;
        }
    }

    @Override
    public Object poll() {
        if (rear == front)
            return null;
        Object p = stackElem[front];
        front = (front + 1)%stackElem.length;
        return p;
    }

    public void display(){
        for (int i = front;i !=rear; i = (i + 1)%stackElem.length){
            System.out.print(stackElem[i]+" ");
        }
        System.out.println();
    }

}
