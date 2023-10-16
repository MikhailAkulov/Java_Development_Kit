package Example_2.InterfaceExamples;

public interface Bull {
    public static final int amount = 4;
    default void walk() {
        System.out.println("Walks on " + amount + " hooves");
    }
    void talk();
}
