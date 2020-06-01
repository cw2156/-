package DataStructure.demo13;


public class CircleSqQueue implements IQueue{
    public int[] queueElem;
    public int front;  //队首
    public int rear;	//队尾
    public int maxSize;
    public CircleSqQueue(int N){
        /*初始化，指向队列的队首*/
        this.front = 0;
        /*初始化，指向队列的队尾*/
        this.rear = 0;
        this.maxSize = N;
        queueElem = new int[maxSize];
    }

    /* 队列置空函数*/
    public void clear(){
        rear = front;
    }

    /*判空函数*/
    public boolean isEmpty() {
        return rear == front;
    }

    /*队列当前长度函数*/
    public int length() {
        return (rear - front + maxSize)% maxSize;
    }

    /*队首元素*/
    public int peek(){
        if (isEmpty())      // 队列为空
            throw new RuntimeException("队列为空，没有头数据");
        else
            return queueElem[front];  // 返回队首元素
    }
    /*判断是否队满*/
    public boolean isFull(){
        return (rear + 1) % maxSize == front;

    }

    /*入队操作*/
    public void offer(int x) throws Exception{
        if(isFull())
            throw new Exception("队列已满");
        else{
            queueElem[rear] = x;
            rear = (rear + 1) % maxSize;
        }
    }

    /*出队操作*/
    public int poll(){
        if (isEmpty())
            throw new RuntimeException("队列为空");

        int value = queueElem[front];
        // 将front后移,考虑取模
        front = (front + 1) % maxSize;
        // 将临时保存的变量返回
        return value;
    }

    /*遍历顺序队列*/
    public void display(){
        if(isEmpty()){
            System.out.print("队列空的，没有数据~");
        }
        else{
            for(int i = front;i<front+length();i++)
                System.out.print(queueElem[i]+"\t");
        }
    }
}

