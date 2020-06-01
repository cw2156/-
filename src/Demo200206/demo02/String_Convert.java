package Demo200206.demo02;

//public char[] tocharArray();
//public byte[] getBytes();
//public String replace(char sequence old string,char Sequence new String);
public class String_Convert {
    public static void main(String[] args) {
        char[] str = "hello".toCharArray();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }
        byte[] str1 = "abc".getBytes();
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
        String str3 = "五毒机关时间大写万达王法田地天禧";
        String str4 = str3.replace("田地", "****");
        System.out.println(str4);

    }
}
