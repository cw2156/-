package Demo200219.demo01;
//在10.8----5.1之间获取绝对值大于6的或者小于2.1的整数
//分析；
/*因为是整数所以-10.8必须取整，可以向上或向下
public static double ceil（doubel num）向上取整-10.8等于-10
public static double floor (doubel num)向下取整；
public static double abs(doubel num)绝对值；
5.1向上取整整。就是获取本值
之后用dowhile循环判定；
每个数值都是整数之后就是++；
比较是否在数值的区间内；
如果是true那就输出数值‘
* */

public class Math_01 {
    public static void main(String[] args) {
        int count=0;
        double a=-10.8;
        double b=5.1;
        do {
            a=Math.ceil(a);
            if(Math.abs(a)>6||Math.abs(a)<2.1){
                System.out.println(a);
                count++;
            }
            a++;

        }while(a!=Math.floor(b));
        System.out.println(count);
    }
}
