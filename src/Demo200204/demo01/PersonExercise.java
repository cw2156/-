package Demo200204.demo01;

public class PersonExercise {
    public static void main(String [] arge){
        Person [] array=new Person[3];
        Person one=new Person("天下",20);
        Person two=new Person("地下",20);
        Person three=new Person("人间",20);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[0].getName()+array[0].getAge());


    }
}
