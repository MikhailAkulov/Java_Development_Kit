package Example_3.Task5;

/**
 * Задача 5.
 * Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
 * чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 */

public class Main {
    public static void main(String[] args) {
        Person person1 = new HardWorker();
        Person person2 = new HardWorker();
        Person person3 = new HardWorker();
        Person person4 = new HardWorker();
        Person person5 = new HardWorker();
        Person person6 = new Idler();
        Person person7 = new Idler();
        Person person8 = new Idler();
        Person person9 = new Idler();
        Person person10 = new Idler();

        Person[] workers = {person1, person3, person5, person7, person9};

        Workplace<? extends Person> factory = new Workplace<>(workers);

        for (Person worker: workers) {
            System.out.println(worker);
        }
    }
}
