package Demo200217.demo02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_sout {
    public static void main(String[] args) {
        int a = 0;
        int[] c = new int[10];
        int t = 0,t2=0;
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            int t1 = 0;
            int b = 0;
            do {
                if (c[b] == 0) {
                    c[b] = a;
                    t1 = 1;
                } else if (a <c[b]) {
                    for (int i1 = 0; i1 < 10 - b; i1++) {
                        t=c[i1+b];
                        c[i1+b]=a;
                        a=t;
                    }
                    t1 = 1;
                }
                b++;
            } while (t1 == 0);


            String str= Arrays.toString(c);
                System.out.print(str);



        }

    }
}
