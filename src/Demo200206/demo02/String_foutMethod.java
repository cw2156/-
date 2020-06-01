package Demo200206.demo02;
//public int lenght();
//public  int indexof();
//public String concat();
//public char chatAt();
public class String_foutMethod {
    public static void main(String[] args) {
        int lenght="alksdjflskjdfl".length();
        System.out.println(lenght);
        String str1="sldfh";
        String Str2="asdfkl";
        String Str3=new String();
        Str3=str1.concat(Str2);
        System.out.println(Str3);
        System.out.println("=====================");
        System.out.println(str1.charAt(2));
        System.out.println(str1);//d
        System.out.println("=====================");
        System.out.println(Str3.indexOf("asdfkl"));//5
        System.out.println(Str3.indexOf("asdfkl1"));//-1
    }
}
