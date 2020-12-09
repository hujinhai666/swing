import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_bg=new JLabel();
    JLabel frog1=new JLabel();
    JLabel frog2=new JLabel();
    JLabel frog3=new JLabel();
    JLabel label_fenshu=new JLabel();
    JTextArea textArea_A=new JTextArea();
    int x1=370,y1=270,x2=250,y2=120,x3=530,y3=15,xx3=620,xxx3=710;
    int defen=0;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textArea_A.append(String.valueOf(e.getKeyChar()));
                if(defen==0){
                    //第1只青蛙
                    if(frog1.getX()==40 && frog1.getY()==400 && textArea_A.getText().equals("hello")){
                        frog1.setBounds(x1,y1,128,128);
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                    if(frog1.getX()==x1 && frog1.getY()==y1 && textArea_A.getText().equals("world")){
                        frog1.setBounds(x2,y2,128,128);
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                    if(frog1.getX()==x2 && frog1.getY()==y2 && textArea_A.getText().equals("hi")){
                        frog1.setBounds(x3,y3,128,128);
                        defen=1;
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                }
                if(defen==1){
                    //第2只青蛙
                    if(frog2.getX()==140 && frog2.getY()==400 && textArea_A.getText().equals("hello")){
                        frog1.setBounds(x3,y3,128,128);
                        frog2.setBounds(x1,y1,128,128);
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                    if(frog2.getX()==x1 && frog2.getY()==y1 && textArea_A.getText().equals("world")){
                        frog1.setBounds(x3,y3,128,128);
                        frog2.setBounds(x2,y2,128,128);
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                    if(frog2.getX()==x2 && frog2.getY()==y2 && textArea_A.getText().equals("hi")){
                        frog1.setBounds(x3,y3,128,128);
                        frog2.setBounds(xx3,y3,128,128);
                        defen=2;
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                }
                if(defen==2){
                    //第3只青蛙
                    if(frog3.getX()==240 && frog3.getY()==400 && textArea_A.getText().equals("hello")){
                        frog3.setBounds(x1,y1,128,128);
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                    if(frog3.getX()==x1 && frog3.getY()==y1 && textArea_A.getText().equals("world")){
                        frog3.setBounds(x2,y2,128,128);
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                    if(frog3.getX()==x2 && frog3.getY()==y2 && textArea_A.getText().equals("hi")){
                        frog3.setBounds(xxx3,y3,128,128);
                        defen=3;
                        label_fenshu.setText(String.valueOf("得分:"+defen));
                        textArea_A.setText("");
                    }
                }

            }
        });

    }
    //显示窗体方法
    void go(){
        textArea_A.setBounds(0,0,150,30);
        textArea_A.setText("");
        textArea_A.setVisible(false);
        myPanel.add(textArea_A);

        label_fenshu.setBounds(200,0,100,30);
        myPanel.add(label_fenshu);
        label_fenshu.setText("得分:0");
        label_fenshu.setFont(new Font("宋体",Font.BOLD,26));
        label_fenshu.setForeground(Color.RED);

        java.net.URL imgURL2 = App.class.getResource("img/frog.png");
        frog1.setIcon(new ImageIcon(imgURL2));
        frog1.setBounds(40,400,128,128);
        myPanel.add(frog1);

        java.net.URL imgURL3 = App.class.getResource("img/frog.png");
        frog2.setIcon(new ImageIcon(imgURL3));
        frog2.setBounds(140,400,128,128);
        myPanel.add(frog2);

        java.net.URL imgURL4 = App.class.getResource("img/frog.png");
        frog3.setIcon(new ImageIcon(imgURL4));
        frog3.setBounds(240,400,128,128);
        myPanel.add(frog3);


        myPanel.setLayout(null);
        java.net.URL imgURL1 = App.class.getResource("img/background.png");
        label_bg.setIcon(new ImageIcon(imgURL1));
        label_bg.setBounds(0,0,1024,600);
        myPanel.add(label_bg);

        JFrame frame = new JFrame("青蛙过河");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,600);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
