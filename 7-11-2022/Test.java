class ThreadTest {
    int count = 1;
    public synchronized void printPower(int n) {
        int temp = 1;
        for (count = 1; count <= 5; count++) {
            temp = temp * n;
            System.out.println("power of " + n + " ^ " + count + " is " + temp);

        }
    }
}

public class Test {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        Runnable r1 = new Runnable() {
            public void run() {
                t1.printPower(2);
            }
        };
        Runnable r2 = new Runnable() {
            public void run() {
                t2.printPower(3);
            }
        };
        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);
        th1.start();
        th2.start();


    }
};
