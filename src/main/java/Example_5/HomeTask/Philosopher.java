package Example_5.HomeTask;

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
    static final Philosopher[] philosopher = new Philosopher[n];
    static final Semaphore mutex = new Semaphore(1,1);

    public Philosopher(int id) {
        this.i = i;
        state = THINKING;
        semaphore = new Semaphore(1,1);
    }
}
