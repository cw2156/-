package Dome200605;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteratortext {
    public static void main(String[] args) {
        Collection<String>  coll=new ArrayList<>();
        coll.add("1");
        coll.add("2");
        coll.add("3");
        coll.add("4");
        coll.add("5");
        /*Iterator<String> iterator=  coll.iterator();

        //迭代器的遍历
        //while()
        while(iterator.hasNext()){
           System.out.println(iterator.next());
        }*/
        //for
        for (Iterator<String> it=coll.iterator();it.hasNext();){
            System.out.println(it.next());
        }






    }
}
