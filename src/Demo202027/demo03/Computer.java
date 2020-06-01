package Demo202027.demo03;

public class Computer {
    public static void main(String[] args) {
        UsbInterface usb = new Keyboard();
        on(usb);
        off(usb);
        UsbInterface usb1=new Mouse();
        on(usb1);
        off(usb1);

    }

    public static void on(UsbInterface usb) {
        if (usb instanceof Keyboard) {
            Keyboard key = (Keyboard) usb;
            key.on();

        }
        if (usb instanceof Mouse) {
            Mouse mou = (Mouse) usb;
            mou.on();

        }
    }

    public static void off(UsbInterface usb) {
        if (usb instanceof Keyboard) {
            Keyboard key = (Keyboard) usb;
            key.off();

        }
        if (usb instanceof Mouse) {
            Mouse mou = (Mouse) usb;
            mou.off();

        }
    }

}
