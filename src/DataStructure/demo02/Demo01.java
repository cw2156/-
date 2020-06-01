package DataStructure.demo02;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(CCP(100));
    }
    public static int CCP(int a){
        int sum=0;
        for(int i=5;a/i>0;i*=5){
            sum+=a/i;
        }
        return sum;

    }

}
