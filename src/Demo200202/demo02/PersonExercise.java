package Demo200202.demo02;

public class PersonExercise {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(20);
        person.setName("古力娜扎");
        System.out.println("姓名"+person.getName()+"年龄"+person.getAge());
        Person person1=new Person("迪丽热巴",22);
        System.out.println("姓名"+person1.getName()+"年龄"+person1.getAge());
        person1.setAge(24);
        System.out.println("姓名"+person1.getName()+"年龄"+person1.getAge());


    }
}
