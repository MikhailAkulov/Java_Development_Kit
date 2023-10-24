package Example_3.Task4;

public class HardWorker implements Person{
    @Override
    public void doWork() {
        System.out.println("I love working!");
    }

    @Override
    public void haveRest() {
        System.out.println("I don't know how to rest");
    }
}
