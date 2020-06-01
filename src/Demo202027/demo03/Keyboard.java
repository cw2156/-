package Demo202027.demo03;
//键盘
public class Keyboard implements UsbInterface {
    @Override
    public void off() {
        print();
    }

    @Override
    public void on() {
        usb();
    }


    private void usb() {
        System.out.println("我是键盘");

    }

    private void print() {
        System.out.println("安全退出");
    }
}
