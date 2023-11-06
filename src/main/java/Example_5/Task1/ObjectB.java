package Example_5.Task1;

public class ObjectB {
    public synchronized void stepOne(ObjectA object) {
        System.out.println("stepOne: " + Thread.currentThread().getName());
        object.stepTwo(this);
    }

    public synchronized void stepTwo(ObjectA object) {
        System.out.println("stepTwo: " + Thread.currentThread().getName());
        object.toString();
    }
}
