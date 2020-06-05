package Dome200605;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static  void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("add是增加");
        collection.add("remove 是移除元素");
        collection.add("clear是清除元素");
        collection.add("contains（包含） 是判断是否有元素");
        collection.add("isEmpty 是判断是否为空");
        collection.add("toArray 是转换成数组");
        boolean a2=collection.remove("remove 是移除元素");
        collection.clear();
        boolean a=  collection.isEmpty();
        boolean a1=  collection.contains("contains（包含） 是判断是否有元素");
        String [] array= (String[]) collection.toArray();


    }

}
