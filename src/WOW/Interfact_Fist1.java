package WOW;

import javax.swing.*;

public class Interfact_Fist1 {
    public static void main(String[] args) {

        createAndShow();

    }

    public static void createAndShow(){
        //外观风格
        //JFrame.setDefaultLookAndFeelDecorated(true);
        //创建窗口级设置窗口
        JFrame frame=new JFrame("魔兽世界");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel=new JPanel();
        frame.add(panel);
         /*
         * 调用用户定义的方法并添加组件到面板
         */
        PlanelCompontents(panel);

        //添加HELLO WORLD 标签
        //JLabel label=new JLabel("你好是接");
        //frame.getContentPane().add(label);
        //显示窗口
        frame.pack();
        frame.setVisible(true);
    }
    public static void PlanelCompontents(JPanel panel){
        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);
        //创建 JLable
        JLabel userLabel=new JLabel("硬甲皮个");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        /*
         * 创建文本域用于用户输入
         */
        JTextField userText=new JTextField(20);
        userText.setBounds(10,40,60,25);
        panel.add(userText);

    }
//这段代码是把名字和信息都输入进来；整合到一个类中
    /*public static void  SetMaterials(int x,int y,String name,JPanel panel){
        panel.setLayout(null);

        JLabel userLabel=new JLabel(name);
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        JTextField userText=new JTextField(20);
        userText.setBounds(10,40,60,25);
        panel.add(userText);


    }*/
}
