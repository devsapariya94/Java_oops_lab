class Manage {
    boolean tick;
    int count = 1;
    int MAX = 20;
}

class PrintTick implements Runnable {
    Manage m;

    public PrintTick(Manage m) {
        this.m = m;
    }

    @Override
    public void run() {
        synchronized (m) {
            while (m.count < m.MAX) {
                while (!m.tick) {
                    try {
                        m.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
               System.out.println("Tick");
                m.count++;
                m.tick = false;
                m.notify();

            }
        }

    }

}

class PrintTok implements Runnable {
    Manage m;

    public PrintTok(Manage m) {
        this.m = m;
    }

    @Override
    public void run() {
        synchronized (m) {
            while (m.count < m.MAX) {
                while (m.tick) {
                    try {
                        m.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
               System.out.println("Tok");
                m.count++;
                m.tick = true;
                m.notify();

            }
        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        Manage m = new Manage();
        m.tick = true;
        Thread t1 = new Thread(new PrintTok(m));
        Thread t2 = new Thread(new PrintTick(m));
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