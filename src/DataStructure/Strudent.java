package DataStructure;

import java.util.ArrayList;

public class Strudent {
    public static void main(String[] args) {
        Strudent.getByte( 10);
        System.out.println("=============");
        System.out.println(Strudent.getbyte(10));
    }
    public static String getbyte(int n){
        String A=Integer.toBinaryString(n);

        return A;
    }
    public static void  getByte(int n){

        int a=0;
        int b1;
        while(n!=0){
            b1=n%2;
            n=n/2;
            System.out.print(b1);
        }




    }
}
