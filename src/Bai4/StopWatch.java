package Bai4;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Date now12 = new Date();
        StopWatch st = new StopWatch();
        System.out.println(now12);
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        if (a == 1) {
            st.start();
            System.out.println(st.startTime());
        }
        int b = sa.nextInt();
        if (b == 2) {
            st.stop();
            System.out.println(st.endTime());
            getElapsedTime();
        }
    }
    private static long millis1;
    private static long millis2;
    private Date sta, end;
    public Date startTime() {
        return sta;
    }
    public Date endTime() {
        return end;
    }
    public void start() {
        Date now2 = new Date();
         millis2 = System.currentTimeMillis();
        this.sta=now2;
    }
    public void stop() {
        Date now1 = new Date();
         millis1 = System.currentTimeMillis();
        this.end = now1;
    }
    public static void getElapsedTime() {
        System.out.println("số thời gian: "+(millis1-millis2)+"mili giây");
        System.out.println("số thời gian: "+((millis1-millis2)/1000L)+" giây");
    }
}
