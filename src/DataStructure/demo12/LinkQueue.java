package DataStructure.demo12;


public class LinkQueue {
    @SuppressWarnings("unused")
    private class Node{
        private Node next;
        private Object data;
        public Node(){}
        public Node(Object data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    public Node front;
    public Node rear;
    public int size;
    public LinkQueue(){
        //空链队列，front和rear都是null
        front = null;
        rear = null;
    }
    public LinkQueue(Object data){
        front = new Node(data,null);
        rear = front;
        size++;
    }
    /*链队列大小*/
    public int size(){
        return size;
    }
    /*入队操作*/
    public void offer(Object data){
        //如果该链队列还是空链队列
        if (front == null) {
            front = new Node(data, null);
            rear = front;//只有一个节点，front、rear都指向该节点
        } else {
            Node newNode = new Node(data, null);//创建新节点
            rear.next = newNode;//让尾节点的next指向新增的节点
            rear = newNode;//以新节点作为新的尾节点
        }
        size++;
    }
    /*出队操作*/
    public Object poll(){
        Node oldFont = front;
        front = front.next;
        oldFont.next = null;
        size--;
        return oldFont.data;
    }
    /*获取队首元素*/
    public Object peek(){
        return front.data;
    }
    /*是否为空队*/
    public boolean isEmpty(){
        return size == 0;
    }
    /*清空队列*/
    public void clear(){
        //将front、rear两个节点赋为null
        front = null;
        rear = null;
        size = 0;
    }
    /*遍历队列*/
    public void display() throws Exception{
        if (!isEmpty()) {
            for (Node current = front; current != null; current = current.next)
                System.out.print(current.data.toString() + ", ");
        }
        else
            throw new Exception("Error");

    }
}
