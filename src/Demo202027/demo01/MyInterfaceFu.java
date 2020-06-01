package Demo202027.demo01;

public  interface MyInterfaceFu  {
    public abstract void show();

    public default void show1(){
        System.out.println("默认接口");
            method();
    }
    public default void method(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
