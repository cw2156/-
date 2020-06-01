package DataStructure.demo06;

public interface IStack {
    abstract public void clear();
    abstract public boolean isRmpty();
    abstract int  length();
    abstract public Object peel();
    abstract void push(Object x) throws Exception;
    abstract public Object pop();

}
