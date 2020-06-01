package Demo200204.demo03;

import java.util.ArrayList;

public class ArrayListExercixe {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        boolean a=list.add("123");
        System.out.println("是否添加成功"+a);
        list.add("1233");
        list.add("123123");
        String b=list.get(1);
        System.out.println(b);
        int c=list.size();
        System.out.println(c);
        String d=list.remove(2);
        System.out.println(d);
        System.out.println(list);


    }
}
