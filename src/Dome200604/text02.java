package Dome200604;
//练习数组的复制

import java.lang.reflect.Array;
import java.util.Arrays;

public class text02 {
    public static void main(String[] args) {
      int[] src={1,2,3,4,5};
      int [] best={5,6,7,8,9};
      System.arraycopy(src,0,best,0,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(best));
        StringBuilder builder=new StringBuilder() ;
        builder.append(1).append("2").append("3");
        //因为内部有toString方法所以将缓冲区内容变成字符串

        System.out.println(builder);
        System.out.println(builder.toString());//toString
        //reverse (）方法，将缓冲区内容进行个反转
        builder.reverse();
        System.out.println(builder);
    }

}
