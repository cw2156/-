package Demo200205.demo01;

import java.util.ArrayList;

public class Printl_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("湛山");
        list.add("王五");
        list.add("琉璃");
        list.add("贪婪");
        Print_ArrayList(list);


    }

    private static void Print_ArrayList(ArrayList<String> list1) {
        ArrayList<String> list = list1;
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (0 < i && i < 4) {
                System.out.print("@");
            }

            System.out.print(list.get(i));


        }
        System.out.println("}");


        //for (int i = 0; i < list.size(); i++) {
        //            if (i==list.size()-1 {
        //                System.out.print(list.get(i)+"}");
        //            }
        //  else{
        //            System.out.print(list.get(i)+"@");
        //
        //}
        //        }
        //
    }


}
