package Example_3.Task4;

public class Idler implements Person{
    @Override
    public void doWork() {
        System.out.println("I can't work :(");
    }

    @Override
    public void haveRest() {
        System.out.println("Party Hard!");
    }
}
