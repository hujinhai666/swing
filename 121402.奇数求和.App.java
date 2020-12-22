public class App2 {

    public static void main(String[] args) {
        System.out.println(App1(2147483647L));
    }


    /**
     * 求奇数和
     */
    public static Long App1(Long number){
        Long sumNumber=0L;
        for (int i = 1; i <= number; i=i+2) {
            if (i%2!=0){
                sumNumber+=i;
            }
        }
        return sumNumber;
    }
}
