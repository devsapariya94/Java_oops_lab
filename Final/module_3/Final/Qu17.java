import java.util.*;

public class Qu17 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                for (int i = 1; i <= 50; i++) {
                    System.out.println("Main thread--" + " : " + i);
                    try {
                        Thread.sleep(1000); // main Thread
                    } catch (InterruptedException e) {
                        System.out.println("Thread in sleep mode");
                    }
                }
            }
        };

        for (int i = 1; i <= 100; i++) {
            System.out.println("child thread--" +  " : " + i);
            try {
                Thread.sleep(500); // child Thread
            } catch (InterruptedException e) {
                System.out.println("Thread in sleep mode");
            }
        }

        Thread t1 = new Thread(r1);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}