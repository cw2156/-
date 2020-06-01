package DataStructure.demo04;

public interface List {

        public void clear();
        public boolean isEmpty();
        public int length();
        public Object get(int i) throws Exception;
        public void insert( Object x);
        public void remove(int i);
        public int indexOf(Object x);
        public void display();


}
