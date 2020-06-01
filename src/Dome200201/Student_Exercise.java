package Dome200201;

public class Student_Exercise {
    public static void main(String[] args) {
        student stu=new student();
        stu.setAge(20);
        stu.setName("王海龙");
        stu.setMale(true);
        System.out.println("年龄"+stu.getAge());
        System.out.println("姓名"+stu.getName());
        System.out.println("是男人"+stu.isMale());
    }
}
