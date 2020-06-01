package DataStructure.demo07;

public interface YList {
    public void clear();
    public boolean isEmpty();
    public int length();
    public Object get(int i) throws Exception;
    public void insert( Object x);
    abstract public void insert(int i,Object x);
    public void remove(int i);
    public int indexOf(Object x);
    public void display();
    public void JDNZ( );
    public void JO();
    public void duplicate();

}
