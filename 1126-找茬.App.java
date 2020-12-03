import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_img=new JLabel();
    JLabel label_fenshu=new JLabel();
    int defen,fs1,fs2,fs3,fs4;
    //构造方法
    public App() {
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if((e.getX()>150 && e.getX()<202) && (e.getY()>218 && e.getY()<264)){
                    fs1=1;
                    defen=fs1+fs2+fs3+fs4;
                    label_fenshu.setText(String.valueOf("fenshu:"+defen));
                }
                if((e.getX()>314 && e.getX()<389) && (e.getY()>303 && e.getY()<360)){
                    fs2=1;
                    defen=fs1+fs2+fs3+fs4;
                    label_fenshu.setText(String.valueOf("fenshu:"+defen));
                }
                if((e.getX()>148 && e.getX()<195) && (e.getY()>434 && e.getY()<488)){
                    fs3=1;
                    defen=fs1+fs2+fs3+fs4;
                    label_fenshu.setText(String.valueOf("fenshu:"+defen));
                }
                if((e.getX()>395 && e.getX()<480) && (e.getY()>562 && e.getY()<640)){
                    fs4=1;
                    defen=fs1+fs2+fs3+fs4;
                    label_fenshu.setText(String.valueOf("fenshu:"+defen));
                }
//                System.out.println(e.getX()+","+e.getY());
            }
        });
    }
    //显示窗体方法
    void go(){

        label_fenshu.setBounds(0,100,100,100);
        myPanel.add(label_fenshu);
        label_fenshu.setText("fenshu:");
        label_fenshu.setFont(new Font("Arial",Font.BOLD,20));
        label_fenshu.setForeground(Color.MAGENTA);

        java.net.URL imgURL = App.class.getResource("img/bg1.jpg");
        label_img.setIcon(new ImageIcon(imgURL));
        label_img.setBounds(0,0,1000,800);
        myPanel.add(label_img);

        JFrame frame = new JFrame("找茬游戏");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,800);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
