package Demo200213.demo01;

public class Stringsplit {
    public static void main(String [] args){
        String st1="aaa,bbb,ccc";
        String [] Array=st1.split(",");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);

        }
        System.out.println("====================");
        String str2="aaa.bbb.ccc";
        String [] Array1=str2.split("\\.");
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i]);

        }

    }
}
