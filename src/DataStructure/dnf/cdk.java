package DataStructure.dnf;

public class cdk {
    public static void main(String[] args){

        for (int i = 0; i < 10; i++) {
            System.out.print("D");
            String word = "0123456789ABCDEF";
            String tmp = "";

            for(int i1 = 0; i1 < 15; i1++){
                int rand = (int)(Math.random() * word.length());
                char c = word.charAt(rand);
                if(!tmp.contains(c+"")){
                    tmp += c;
                }else{
                    i1--;
                }
            }
            System.out.println(tmp);

        }

        }
    }

