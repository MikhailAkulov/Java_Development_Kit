package Example_5.HomeTask;

public class Semaphore {
    private int initialValue = 0;
    private int bound = 0;

    public Semaphore(int initialValue, int upperBound) {
        this.bound = upperBound;
        this.initialValue = initialValue;
    }

    public synchronized void up() throws InterruptedException{
        while(this.initialValue == bound){
            System.out.println(Thread.currentThread().getName()+" is waiting: at up");
            wait();
        }
        this.initialValue++;
        this.notify();
    }

    public synchronized void down() throws InterruptedException{
        while(this.initialValue == 0){
            System.out.println(Thread.currentThread().getName()+" is waiting: at down");
            wait();
        }
        this.initialValue--;
        this.notify();
    }

    public void release() {

    }

    public void acquire() {

    }
}
