package DataStructure.demo03;

import java.net.InetAddress;
import java.util.ArrayList;

public class Array02 implements Array01{
    private Object[ ] listelem;
    private int Maxlen;
    private int culen;
    ArrayList<Integer> arraylist=new ArrayList<>();


    public Array02(int maxsize){
        this.Maxlen=maxsize;
        this.culen=0;
       listelem =new Object[maxsize];
    }
    @Override
    public boolean isEmpty() {
        boolean result;
        if (culen == Maxlen) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public int length() {

        return listelem.length;
    }

    @Override
    public Object get(int i) {


        return listelem[i];
    }

    @Override
    public void insert(int i, Object x){
        if (this.Maxlen==this.culen){
            System.out.println("字符串已经满了" );



        }if (i<0||this.Maxlen<i){
            System.out.println("插入不合法");

        }
            for (int i1 =this.culen; i<i1; i1--) {
                listelem[i1]=listelem[i1-1];
            }
            listelem[i]=x;
            this.culen++;

    }

    @Override
    public void remove(int i) {
        if(i>Maxlen){
            System.out.println("删除位置不合法");
        }
        for (int i1 = i; i1 <this.culen-1; i1++) {
            listelem[i1]=listelem[i1+1];

        }
        this.culen--;

    }

    @Override
    public int indexOf(Object x) {
        for (int i = 0; i < listelem.length; i++) {
            if(listelem[i]==x){
            return i;
            }

        }
        return -1;

    }
    public void delete(Object x){
        int a =indexOf(x);
        if (a!=-1){
            remove(a);
        }else
        {
            System.out.println("没有找到数据");
        }


    }

    @Override
    public void display() {
        for (int i = 0; i < this.culen; i++) {
            System.out.println(listelem[i]);

        }
        }



}
