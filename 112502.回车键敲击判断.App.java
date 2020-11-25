import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_A2=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.setText("1.目前谁是中国最有钱的人？\n\tA:马云\n\tB:李嘉诚\n\tC:王健林");
        textArea_A.setBounds(0,0,512,200);
        textArea_A.setBackground(Color.ORANGE);
        myPanel.add(textArea_A);
//        textArea_A2.setText("回答区域：");
        textArea_A2.setBounds(0,205,512,100);
        textArea_A2.setBackground(Color.CYAN);
        myPanel.add(textArea_A2);
        textArea_B.setBounds(0,310,512,200);
        textArea_B.setBackground(Color.green);
        myPanel.add(textArea_B);

        textArea_A2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER ) {
                    if(textArea_A2.getText().equals("A")){
                        textArea_B.setText("回答正确\n");
                        textArea_A2.setText("");
                    }else if(textArea_A2.getText().equals("B")){
                        textArea_B.setText("答案错误，答案接近了\n");
                        textArea_A2.setText("");
                    }else if(textArea_A2.getText().equals("C")){
                        textArea_B.setText("答案又错了，快了快了\n");
                        textArea_A2.setText("");
                    }else{
                        textArea_B.setText("回答错误，输入不规范，请看清题目。");
                        textArea_A2.setText("");
                    }
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
