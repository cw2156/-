package DataStructure.demo26;

public class KeyType implements Comparable <KeyType>{
    public int key;

    public KeyType() {
    }

    public KeyType(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "KeyType{" +
                "key=" + key +
                '}';
    }

    @Override
    public int compareTo(KeyType another) {
        int thisVal=this.key;
        int anotherVal= another.key;
       return (thisVal<anotherVal? -1 : (thisVal==anotherVal? 0:1));
    }
}
