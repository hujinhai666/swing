import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {
        while (true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("输入位置：");
            int next = scanner.nextInt();
            List<Integer> list=new ArrayList<>();
            //遍历斐波那契数列
            int a=0,b=1,c=1;
            //存入数列前三位
            list.add(0);
            list.add(1);
            list.add(1);
            for (int i = 0; i <= 40; i++) {
                a=b;
                b=c;
                c=a+b;
                //存入数组
                list.add(c);
            }
            System.out.println("位置下的数列值为："+list.get(next));
        }
    }
}
