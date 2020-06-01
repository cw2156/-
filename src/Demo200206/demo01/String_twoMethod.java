package Demo200206.demo01;
//public boolead equals (Object obj);
//public boolead equalsIgnoreCase(String str)

import jdk.nashorn.api.tree.SimpleTreeVisitorES5_1;

public class String_twoMethod {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3="Hello";
        System.out.println("hello".equals(str1));
        System.out.println(str2.equals(str1));
        System.out.println(str1.equals("hello"));
        System.out.println("Hello".equalsIgnoreCase(str1));
        System.out.println("Hello".equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
