package Deme200215.demo03;

public class student {

    private String name;
    private int age;
    public static String room;
    private int id;
    private static int number;
    public student() {
        number++;
    }

    public student(String name, int age) {
        this.id=++number;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
