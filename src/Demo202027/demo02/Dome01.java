package Demo202027.demo02;

public class Dome01 {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        Cat cat=(Cat)animal;
        cat.Inhouse();
        System.out.println("=====================");
    }
}
