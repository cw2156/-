package DataStructure.demo05;

import java.util.Scanner;

public class Demo01Fbnqsl {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(Fbnqsl(i)+"  ");
        }


    }
    public static int  Fbnqsl(int a){
        if(a==1||a==2){
            return 1;

        }else
            return Fbnqsl(a-1)+Fbnqsl(a-2) ;
    }


}
