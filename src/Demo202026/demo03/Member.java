package Demo202026.demo03;

import Demo200205.demo02.Arraylist_Random;

import java.util.ArrayList;


public class Member extends User {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Member() {

    }
    public Member(String name,int money){
       super(name,money);
       this.i++;
    }

    public void Gain(int money, ArrayList<Integer> list){

        super.setMoney(money+list.get(getI()-1));

    }

}
