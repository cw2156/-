package Demo202027.demo03;
//鼠标
public class Mouse implements UsbInterface {
    @Override
    public void off() {
        print();
    }

    @Override
    public void on() {
            usb();
    }

    private void usb() {
        System.out.println("我是鼠标");

    }
    private void print(){
        System.out.println("安全退出");
    }
}
