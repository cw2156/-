package Demo200204.demo05;

public class Student {
    private int sno;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    public Student(String 郭靖, int i) {
    }

    public void setSno(int sno1){
        sno=sno1;
    }
    public int getSno(){
        return sno;

    }
    public void setName(String name1){
        name=name1;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age1){
        age=age1;
    }
    public int getAge(){
        return age;
    }


}
