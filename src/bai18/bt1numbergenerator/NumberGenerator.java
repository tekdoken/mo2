package bai18.bt1numbergenerator;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            NumberGenerator o = new NumberGenerator();
            System.out.println(o.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread num1 = new Thread(new NumberGenerator());
        Thread num2 = new Thread(new NumberGenerator());
        num1.setPriority(Thread.MIN_PRIORITY);
        num2.setPriority(Thread.MAX_PRIORITY);
        num1.start();
        num2.start();
    }
}
