package DataStructure.demo11;

public class towHNT {
    public static void main(String[] args) {
        doHNT(3,'a','b','c');
    }
    public static  void doHNT(int a,char x,char y,char z){
        if(a==1){
            System.out.println("Dish 1 from "+x+"to "+z);
        }
        else{
            doHNT(a-1,x,z,y);
            System.out.println("Dish "+ a + " from "+x+" to "+z);
            doHNT(a-1,y,x,z);
        }
    }
}
