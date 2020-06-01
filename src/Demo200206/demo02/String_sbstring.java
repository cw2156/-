package Demo200206.demo02;
//publci String substring(int index);
//publci String substring(int index, int index1)
public class String_sbstring {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3=str1.substring(1);
        System.out.println(str3);
        str3=str2.substring(1,4);
        System.out.println(str3);
    }
}
