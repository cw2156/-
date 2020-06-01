package Demo200216.demo01;
import Deme200215.demo03.student;
public class StaticStudent {
    public static void main(String[] args) {
        student.room="101教室";
        student one=new student("郭靖",20);
        System.out.println("姓名"+one.getName()+"年龄"+one.getAge()+"教室"+student.room);
        student tow =new student("黄蓉",21);
        System.out.println("姓名"+tow.getName()+"年龄"+tow.getAge()+"教室"+student.room);
        /*栈                        堆
        * |——————————————————————| |————————————————————————————————————|
        * |studetn  one 0x666    | |new student("郭靖",20);  0x666       |
        * |                      | |                                    |
        * | student tow          | |new student("黄蓉",21);   0x999      |
        * |                      | |————————————————————————————————————|
        * |                      | 方法体
        * |                      | |————————————————————————————————————--|
        * |                      | | student(){          静态区            |
        * |     student.room     | |  String name ;     |---------------| |
        * | void main{}          | |  int age;          |   room  101教室| |
        * |                      | |  static String room|               | |
        * |                      | |                    |---------------|
        * |——————————————————————| |——————————————————————————————————————|
        * */
    }
}
