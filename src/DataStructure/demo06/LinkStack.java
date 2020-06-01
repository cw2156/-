package DataStructure.demo06;

import java.sql.ClientInfoStatus;

public class LinkStack implements IStack {
    private Node top=null;
    @Override
    public void clear() {
        top=null;
}

    @Override
    public boolean isRmpty() {
        if(top==null){
            return false;
        }else
            return true;


    }

    @Override
    public int length() {
         int length = 0;
        while(top!=null){
            Node p=top;
            top=p.getNext();
            length++;

        }
        return 0;
    }

    @Override
    public Object peel() {
        return null;
    }

    @Override
    public void push(Object x) throws Exception {
        Node p= new Node(x);
        p.setNext(top);
        top=p;


    }

    @Override
    public Object pop() {

        Node p=top;
        Object x=top.getData();
        top=p.getNext();

        return x;

    }
    public void display(){
        Node p;
        while(top!=null){
            p=top;
            System.out.println(top.getData());
            top=p.getNext();

        }
    }

    public boolean isEmpty() {
        return true;
    }
}
