package Demo200528;

public class Demoequals {
    public static void main(String[] args) {
        Person person=new Person("迪丽热巴",12);
        Person person1=new Person("迪丽热巴",12);
        boolean s=person.equals(person1);
        System.out.println(s);
    }
}
