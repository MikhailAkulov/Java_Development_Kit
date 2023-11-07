package Example_5.HomeTask;

/**
 * Формулировка задачи:
 * Есть пять философов (потоки), которые могут либо обедать либо размышлять.
 * Каждый философ должен пообедать три раза.
 * Каждый прием пищи длиться 500 миллисекунд
 * После каждого приема пищи философ должен размышлять
 * Не должно возникнуть общей блокировки
 * Философы не должны есть больше одного раза подряд
 */

public class Philosopher extends Thread{

    public static final int THINKING = 0;
    public static final int HUNGRY = 1;
    public static final int EATING = 2;

    private final int i;
    private int state;
    private final Semaphore semaphore;
    static final int n = 5;
    static final String[] st = new String[3];
    static int[] philStatus = new int[n];
    static final Philosopher[] philosophers = new Philosopher[n];
    static final Semaphore mutex = new Semaphore(1,1);

    public Philosopher(int id) {
        this.i = id;
        state = THINKING;
        semaphore = new Semaphore(1,1);
    }

    public static void main(String[] args) {
        st[0] = "Thinking";
        st[1] = "Hungry";
        st[2] = "Eating";

        philosophers[0] = new Philosopher(0);
        for (int i = 0; i < n; i++) {
            philosophers[i] = new Philosopher(i);
        }

        for (int i = 0; i < n; i++) {
            philStatus[i] = 0;
        }
        new Thread(philosophers[0], "Philosopher_1").start();
        new Thread(philosophers[1], "Philosopher_2").start();
        new Thread(philosophers[2], "Philosopher_3").start();
        new Thread(philosophers[3], "Philosopher_4").start();
        new Thread(philosophers[4], "Philosopher_5").start();
    }

    private Philosopher left() {
        return philosophers[(i + n - 1) % n];
    }

    private Philosopher right() {
        return philosophers[(i + n) % n];
    }

    public void run() {
        try {
            while (true) {
                showStatus();
                if (state == THINKING) {
                    thinking();
                    mutex.down();
                    state = HUNGRY;
                } else if (state == HUNGRY) {
                    test(this);
                    mutex.up();
                    semaphore.acquire();
                    state = EATING;
                } else {
                    eating();
                    mutex.down();
                    state = THINKING;

                    test(left());
                    test(right());
                    mutex.up();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void test(Philosopher p) {
        if (p.left().state != EATING && p.state == HUNGRY && p.right().state != EATING) {
            try {
                p.state = EATING;
                p.semaphore.release();
            } catch (Exception e) {
                System.out.println(Philosopher.class.getName() + e);
            }
        }
    }

    void eating() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void thinking() {
        try {
            Thread.sleep((long) Math.round(Math.random() * 5000));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    void showStatus() {
        String status;
        if (state == THINKING) {
            status = "Thinking";
            philStatus[i] = THINKING;
        } else if (state == EATING) {
            status = "Eating";
            philStatus[i] = EATING;
        } else {
            status = "Hungry";
            philStatus[i] = HUNGRY;
        }
        System.out.println(Thread.currentThread().getName() + " is " + status);
    }
}
