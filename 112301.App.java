package pac;

import java.util.Random;
import java.util.Scanner;

public class App {
    public  static  void main(String[] args){
        System.out.println("请输入一位数：");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int sr = scanner.nextInt();
            if (sr == 1) {
                System.out.println("X坐标为：" + (int) (Math.random() * 100 % 100));
                System.out.println("Y坐标为：" + (int) (Math.random() * 100 % 100));
            }else{
                System.out.println("无效数值,请输入1");
            }
        }
    }
}
