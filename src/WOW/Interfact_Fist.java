package WOW;

import javax.swing.*;

public class Interfact_Fist {
    public static void main(String[] args) {
        //显示应用GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }
    //界面设计
    public static void createAndShowGUI(){
        //外观风格
        JFrame.setDefaultLookAndFeelDecorated(true);
        //创建窗口级设置窗口
        JFrame frame=new JFrame("魔兽世界");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //添加HELLO WORLD 标签
        //JLabel label=new JLabel("你好是接");
        //frame.getContentPane().add(label);
        //显示窗口
        frame.pack();
        frame.setVisible(true);
    }
}
