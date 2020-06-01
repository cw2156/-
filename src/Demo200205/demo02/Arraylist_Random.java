package Demo200205.demo02;

import java.util.ArrayList;
import java.util.Random;

public class Arraylist_Random {
    public static void main(String[] args) {
        ArrayList<Integer> big = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            big.add(rand.nextInt(30));

        }
         ArrayList<Integer> small=geteven_number(big);
        System.out.println("输出偶数个数为"+small.size());
        System.out.println(small);

    }

    public static ArrayList geteven_number(ArrayList big) {
        ArrayList<Integer> small = new ArrayList<>();

        for (int i = 0; i < big.size(); i++) {
            if ((int)big.get(i) % 2 == 0){
                small.add((int)big.get(i));

            }
        }
        return small;
    }


}
