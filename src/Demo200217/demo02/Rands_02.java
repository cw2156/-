package Demo200217.demo02;

import java.util.Random;

public class Rands_02 {
    public static void main(String[] args) {
        //-1-1Random random=new Random();
        int [] list=new int [10];
        //-1-int ran=random.nextInt(10)+1;
        for (int i = 0; i < 1000; i++) {
            //-1-ran=random.nextInt(10)+1;
            int ran=(int )(Math.random()*10)+1;//0.0<=Math.random()<1.0
            list[ran-1]++;
        }
        for (int i=0;i<list.length;i++){
            System.out.println(i+1+"产生了"+list[i]);
        }
        }
}
