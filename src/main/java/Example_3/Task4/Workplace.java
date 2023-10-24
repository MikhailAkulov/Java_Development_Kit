package Example_3.Task4;

public class Workplace<T extends Person> {
    private T[] community;

    public Workplace(T[] community) {
        this.community = community;
    }

    public void workForAll() {
        for (T t: community) {
            t.doWork();
        }
    }
}
