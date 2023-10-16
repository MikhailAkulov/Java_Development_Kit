package Example_2.InterfaceExamples;

public interface Human {
    default void walk() {
        System.out.println("Walks on two feet");
    }
    public void talk();
}
