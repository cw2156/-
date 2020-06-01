package Demo202026.demo03;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        Group_owner go = new Group_owner("群主", 100);
        Member me = new Member("成员.", 10);
        Member me1 = new Member("成员1.",20);
        Member me2 = new Member("成员2.", 30);

        go.show();
        me.show();
        me1.show();
        me2.show();
        System.out.println("==============================");
        ArrayList<Integer> list = go.Get_Money(3, 30);
        me.Gain(me.getMoney(), list);
        me1.Gain(me1.getMoney(), list);
        me2.Gain(me2.getMoney(), list);
        go.show();
        me.show();
        me1.show();
        me2.show();

    }
}
