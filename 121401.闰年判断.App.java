import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入要查询的年份：");
            int year = scanner.nextInt();
            if (-3200 < year && year < 0) {
                if (year % 4 != 0 || year % 400 != 0) {
                    System.out.println(year + "是公元前闰年");
                } else {
                    System.out.println("不是闰年");
                }
            } else {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + "是公元后闰年");
                } else {
                    System.out.println("不是闰年");
                }
            }
        }
    }
}
