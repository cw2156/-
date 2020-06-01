package Demo200204.demo05;

import java.util.ArrayList;
import java.util.Scanner;

public class SrudentExercise {
    public static void main(String[] args) {
        ArrayList<Student> student=new ArrayList<Student>();
        Student stu=new Student();
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("请输入第"+(i+1)+"学生的学号，姓名，年龄");

            stu.setSno(scanner.nextInt());
            //System.out.println(stu.getSno());
            stu.setName(scanner.next());
            //System.out.println(stu.getName());
            stu.setAge(scanner.nextInt());
           // System.out.println(stu.getAge());

            student.add(stu);
            System.out.println(student.size());

        }
       // System.out.println(student);
        for (int i = 0; i < student.size(); i++) {
            System.out.println("学号："+student.get(i).getSno()+"姓名："+student.get(i).getName()+"年龄："+student.get(i).getAge());


        }

    }
}
