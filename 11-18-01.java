package pac;

import javax.swing.*;

public class App {
    private JPanel myPanel;
    void  go(){
        JFrame frame = new JFrame("打工人");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);             //设置窗体屏幕居中
        frame.setBounds(400,400,600,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
