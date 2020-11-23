package pac;

public class App2 {
    public  static  void main(String[] args) throws InterruptedException {
        while(true) {
           Thread.sleep(1000);
            System.out.println("X:"+(int)(Math.random() * 100%100)+" , "+"Y:"+(int)(Math.random() * 100%100));
        }
    }
}
