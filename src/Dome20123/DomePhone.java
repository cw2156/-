package Dome20123;
import Dome20123.Phone;

public class DomePhone {
    public static void main(String[] args) {
        Phone one =new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.call("王海龙");
        one.sendMessage();
        System.out.println("=======================");
        one.brand="苹果";
        one.color="red";
        one.price="2001";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
    }
}
