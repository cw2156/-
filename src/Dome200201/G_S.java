package Dome200201;


import org.w3c.dom.ls.LSOutput;

public class G_S {

    String name;
    private int age;

    public void show() {
        System.out.println("年龄" + age + "姓名" + name);
    }

    public void setAge(int num) {
        if (num > 0 && num < 100)
            age = num;
        else
            System.out.println("数据错误");



    }

    public int getAge() {

        return age;
    }
}
