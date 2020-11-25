import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.setText("欢迎来到0.0");
        textArea_A.setBounds(0,0,512,200);
        textArea_A.setBackground(Color.orange);
        myPanel.add(textArea_A);
        textArea_B.setBounds(0,250,512,500);
        textArea_B.setBackground(Color.yellow);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    textArea_B.append("1111\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_B.append("2222\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    textArea_B.append("3333\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    textArea_B.append("4444\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    textArea_B.setText("");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("哈哈");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
