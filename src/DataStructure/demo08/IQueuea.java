package DataStructure.demo08;

public class IQueuea implements IQueue {
    private Object [] queueElem;
    private int front;
    private int rear;
    private int maxsize;



    public IQueuea(int maxsize) {
       this.queueElem =new Object[maxsize];
       this.front=this.rear=0;
       this.maxsize=maxsize;

    }

    @Override
    public void clear() {
        front=rear=0;

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        int lenght=0;
        if(rear>=front){
            lenght=rear-front;
        }else{
           lenght= maxsize-(maxsize-front)+rear;
        }



        return lenght;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public void offer(Object x) throws Exception {
        if((rear+1)%maxsize==front){
            System.out.println("队满");
        }else {
            queueElem[rear] = x;
            rear = (rear + 1) % maxsize;
        }


    }

    @Override
    public Object poll() {
       int abc = 0;
        if(rear==front){
            System.out.println("队空");
        }else{
         abc=front;
           front=(front+1)%maxsize;

        }
        return queueElem[abc];
    }
    public void display(){
        if(rear==front){
            System.out.println("队空");
        }else{
            int c=front;
            while(rear!=c){
                System.out.println(queueElem[c]);
                c=(c+1)%maxsize;
            }
        }
    }
}
