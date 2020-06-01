package Demo200204.demo04;

import java.util.ArrayList;
import java.util.Random;

//生成6个随机数1--33之间，添加集合，遍历集合。
public class Demo_ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {

            int a = random.nextInt(33) + 1;
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.remove(i));

        }


    }
}
