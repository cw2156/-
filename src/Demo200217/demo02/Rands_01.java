package Demo200217.demo02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Rands_01 {
    public static void main(String[] args) {
        Random random=new Random();
        int [] list=new int [10];
        int ran=random.nextInt(10)+1;
        for (int i = 0; i < 10; i++) {
            ran=random.nextInt(10)+1;
            System.out.println(ran);
            for (int i1 = 0; i1 < 10; i1++) {
                if(ran==i1+1){
                    list[i1]+=1;
                }

            }
        }
        System.out.println("1出现"+list[0]+",2出现"+list[1]+",3出现"+list[2]+
                ",4出现"+list[3]+",5出现"+list[4]+",6出现"+list[5]+",7出现"+list[6]+
                ",8出现"+list[7]+",9出现"+list[8]+",10出现"+list[9]);

    }
}
