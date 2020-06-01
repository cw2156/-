package DataStructure.demo03;

public interface Array01 {
    abstract  public boolean isEmpty();
    abstract  public int length();
    abstract  public Object get(int i);
    abstract  public void insert(int i, Object x) throws Exception;
    abstract  public void remove(int i);
    abstract  public int indexOf(Object x);
    abstract  public void display();


}
