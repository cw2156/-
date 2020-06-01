package Demo202026.demo03;

import java.util.ArrayList;

public class Group_owner extends User{
    public Group_owner(String name ,int money){
        super(name, money);

    }

    public ArrayList<Integer> Get_Money(int num,int money){
        ArrayList<Integer> list=new ArrayList<>();
        if(money>super.getMoney()){
            System.out.println("余数不足");

            for (int i = 0; i < num; i++) {
                list.add(i,0/num);}
        }
        else{
        super.setMoney(super.getMoney()-money);
        for (int i = 0; i < num; i++) {
            list.add(i,money/num);

        }}

        return list;
    }

}
