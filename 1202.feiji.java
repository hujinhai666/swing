import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_bg=new JLabel();
    JLabel feiji=new JLabel();
    JLabel label_txt=new JLabel();
    int zb=10;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                    if (e.getKeyCode() == KeyEvent.VK_UP) {
                        feiji.setBounds(feiji.getX(),feiji.getY()-zb,60,60);
                    }
                    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                        feiji.setBounds(feiji.getX()-zb,feiji.getY(),60,60);
                    }
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                        feiji.setBounds(feiji.getX()+zb,feiji.getY(),60,60);
                    }
                    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                        feiji.setBounds(feiji.getX(),feiji.getY()+zb,60,60);
                    }
//                    if(feiji.getX()>720){
//                        label_txt.setBounds(0,0,512,720);
//                    }
            }
        });

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL2 = App.class.getResource("img/plane0.png");
        feiji.setIcon(new ImageIcon(imgURL2));
        feiji.setBounds(200,615,64,64);
        myPanel.add(feiji);

//        label_txt.setText("超出");
//        label_txt.setBounds(600,800,512,720);
//        myPanel.add(label_txt);

        myPanel.setLayout(null);
        java.net.URL imgURL1 = App.class.getResource("img/background.png");
        label_bg.setIcon(new ImageIcon(imgURL1));
        label_bg.setBounds(0,0,512,720);
        myPanel.add(label_bg);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
