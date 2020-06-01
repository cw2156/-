package 练习;

public class nested_loop {
    public static void main (String [] args){
        for(int hour=0;hour<24;hour++){
            for (int minute=0;minute<59;minute++){
                for (int second=0;second<59;second++){
                    System.out.println(hour+"小时"+minute+"分钟"+second+"秒");
                }
            }

        }
    }

}
