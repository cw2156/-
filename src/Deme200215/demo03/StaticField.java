package Deme200215.demo03;



public class StaticField {
    public static void main(String[] args) {
        student one=new student ("郭靖",19);
        one.room="天堂1号";
        System.out.println("姓名"+one.getName()+",年龄"+one.getAge()+",学号"+one.getId()+"，教室"+one.room);
        student tow=new student ("黄蓉",12);
        System.out.println("姓名"+tow.getName()+",年龄"+tow.getAge()+",学号"+tow.getId()+"，教室"+tow.room);
    }
}
