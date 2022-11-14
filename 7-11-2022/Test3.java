class Manage {
    boolean odd;
    int count = 1;
    int MAX = 20;
}

class PrintOdd implements Runnable {
    Manage m;

    public PrintOdd(Manage m) {
        this.m = m;
    }

    @Override
    public void run() {
        synchronized (m) {
            while (m.count < m.MAX) {
                while (!m.odd) {
                    try {
                        m.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + m.count);
                m.count++;
                m.odd = false;
                m.notify();

            }
        }

    }

}

class PrintEven implements Runnable {
    Manage m;

    public PrintEven(Manage m) {
        this.m = m;
    }

    @Override
    public void run() {
        synchronized (m) {
            while (m.count < m.MAX) {
                while (m.odd) {
                    try {
                        m.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread :" + m.count);
                m.count++;
                m.odd = true;
                m.notify();

            }
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        Manage m = new Manage();
        m.odd = true;
        Thread t1 = new Thread(new PrintEven(m));
        Thread t2 = new Thread(new PrintOdd(m));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}