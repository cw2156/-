package Demo200216.demo02;

public class Prime {
    public static void main(String[] args) {
        int prime=0;
        int sum=0;
        for (int i = 2; i <=1000; i++) {
            sum=0;
            for (int i1 = 2; i1 < i; i1++) {
                if(i%i1==0){
                    sum+=1;

                }



            }
            if (sum==0)
            System.out.println(i+"是质数");
            prime+=i;
        }
        System.out.println(prime);
    }
}
