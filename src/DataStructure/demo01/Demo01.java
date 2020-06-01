package DataStructure.demo01;

public class Demo01 {
    public static void main(String[] args) {
        int  s;
        int  b;
        System.out.println(sum(75,25));
    }
    public static int sum(int a ,int b){

        int c=a%b;
        while(c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        return b;
    }
}
