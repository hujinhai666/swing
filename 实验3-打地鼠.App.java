
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class App {

    private JPanel myPanel=new JPanel();
    private JLabel label_img=new JLabel();
    private JLabel label_bg=new JLabel();
    private JLabel label_fenshu=new JLabel();
    int i=0;

    public App() {
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label_img.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),60,60);
                i++;
               label_fenshu.setText("fenshu:"+String.valueOf(i));
            }
        });
    }

    void go(){
        //打包引用的图片资源
        java.net.URL imgURL1 = App.class.getResource("bg.jpg");
        label_bg.setIcon(new ImageIcon(imgURL1));
        java.net.URL imgURL2 = App.class.getResource("laoshu2.gif");
        label_img.setIcon(new ImageIcon(imgURL2));
        myPanel.setLayout(null);
        label_img.setBounds(100,100,75,75);
        label_bg.setBounds(0,0,1024,720);
        label_fenshu.setBounds(50,0,200,200);
        label_fenshu.setFont(new Font("Arial",Font.BOLD,20));
        label_fenshu.setForeground(Color.blue);

        myPanel.add(label_fenshu);
        myPanel.add(label_img);
        myPanel.add(label_bg);

        JFrame frame = new JFrame("憨憨打地鼠 v0.1");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,720);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go(); 
    }
}
