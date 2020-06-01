package Demo200217.demo02;

import java.util.Arrays;
import java.util.Random;

public class TowcolorBall {
    public static void main(String[] args) {
        Random random=new Random();
        String str=null;
        String str1="";
        System.out.println("双色球随机出球判断");
        int a=0 ;
        for (int i = 0; i < 7; i++) {
            int c=0;
            do{
            a=random.nextInt(33)+1;
            str=String.valueOf(a);
            c=str1.indexOf(str);
               if(c==-1){
                   str1=str1.concat(str);
                   str1=str1.concat(" ");
               }
        }while (c!=-1);
    }
        a=random.nextInt(16)+1;
        str=String.valueOf(a);
        str1=str1.concat(str);
  System.out.println(str1);
    }
}
