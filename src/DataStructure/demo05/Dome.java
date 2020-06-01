package DataStructure.demo05;
import java.util.Arrays;
public class Dome{
    public static void main(String[] args) {
        String line = "ABCDEFG";
        char[] line1 = line.toCharArray();
        Arrays.sort(line1);
        for (int i = line1.length-1; i >= 0; i--) {
            System.out.print(line1[i]);
        }
        String line3=Arrays.toString(line1);
         System.out.println(line3);
        System.out.println("=================");
        String line1_1 = "ABCDEFGE";
        char[] line1_2 = line1_1.toCharArray();
        Arrays.sort(line1_2);
        for (int i = line1_2.length-1; i >= 0; i--) {
            System.out.print(line1_2[i]);
        }
        String line3_1=Arrays.toString(line1_2);
        System.out.println(line3_1);

    }
}