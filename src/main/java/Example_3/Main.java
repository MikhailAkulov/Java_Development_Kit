package Example_3;

import Example_3.Task4.*;

import java.io.*;

/**
 * Задачи:
 *
 * Задача 1.
 * Создать обобщенный класс с 3-мя параметрами (T, V, K).
 * Класс содержит 3 переменные типа (T, V, K),
 * конструктор, принимающий на вход параметры типа (T, V, K),
 * методы, возвращающие значения 3-х переменных.
 * Создать метод, выводящий на консоль имена классов для 3-х переменных класса.
 * наложить ограничения на параменты типа:
 * T должен реализовывать интерфес Comparable (классы оболочки, String),
 * V должен реализовывать интерфес DataInput и расширять класс InputStream,
 * R должен расширять класс Number
 *
 * Задача 2.
 * Описать собственную коллекцию - список на основе массива.
 * Коллекция должна иметь возможность хранить любые типы данных,
 * иметь методы добавления и удаления элементов.
 *
 * Задача 3.
 * Написать итератор по массиву
 *
 * Задача 4.
 * Описать интерфейс Person с методами doWork() и haveRest().
 * Написать два класса Работник и Бездельник, реализующих интерфейс.
 * Работник работает и не умеет бездельничать, в то время как
 * Бездельник не умеет работать, но умеет отдыхать.
 * Написать обобщенные классы Workplace и Club, содержащие массив из Person.
 * В классах необходимо у всего массива людей вызвать соответствующие методы.
 *
 * Задача 5.
 * Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
 * чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
 *
 * Задача 6.
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 *
 * Задача 7.
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает
 * true, если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
 *
 * Задача 8.
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 *
 * Задача 9.
 * Создайте интерфейс, который определяет набор методов для работы с базой данных
 * (например, сохранение, удаление, получение данных).
 * Реализуйте этот интерфейс в конкретном классе.
 */

public class Main {
    /**
     * Main Задачи №1
     */
//    public static void main(String[] args) throws FileNotFoundException {
//        InputStream is = new DataInputStream(new FileInputStream("test.txt"));
//        FirstClass<String, DataInputStream, Integer> fc = new FirstClass<>("any", new DataInputStream(is), 3);
//        fc.getNameClass();
//    }

    /**
     * Main Задачи №2
     */
//    public static void main(String[] args) {
//        ParamCollection<Double> paramCollection = new ParamCollection<>(new Double[10]);
//        paramCollection.print();
//        System.out.println();
//        paramCollection.add(2.0);
//        paramCollection.add(1.0);
//        paramCollection.add(3.0);
//        paramCollection.print();
//        System.out.println();
//        paramCollection.delete(0);
//        paramCollection.print();
//    }

    /**
     * Main Задачи №3
     */
//    public static void main(String[] args) {
//        ParamCollection<Double> paramCollection = new ParamCollection<>(new Double[10]);
//        paramCollection.print();
//        System.out.println();
//        paramCollection.add(2.0);
//        paramCollection.add(1.0);
//        paramCollection.add(3.0);
//        paramCollection.add(5.0);
//        paramCollection.add(7.0);
//        paramCollection.add(6.0);
//        for (Double aDouble: paramCollection) {
//            System.out.printf(aDouble + " ");
//        }
//    }

    /**
     * Main Задачи №4
     */
//    public static void main(String[] args) {
//        Person person1 = new HardWorker();
//        Person person2 = new HardWorker();
//        Person person3 = new HardWorker();
//        Person person4 = new HardWorker();
//        Person person5 = new HardWorker();
//        Person person6 = new Idler();
//        Person person7 = new Idler();
//        Person person8 = new Idler();
//        Person person9 = new Idler();
//        Person person10 = new Idler();
//
//        Person[] workers = {person1, person3, person5, person7, person9};
//        Person[] idlers = {person2, person4, person6, person8, person10};
//
//        Workplace<? extends Person> factory = new Workplace<>(workers);
//        Club<? extends Person> club = new Club<>(idlers);
//
//        factory.workForAll();
//        club.partyForAll();
//    }

    /**
     * Main Задачи №5
     * см в Task5.Main
     */

    /**
     * Main Задачи №6
     * см в Task6.Main
     */

    /**
     * Main Задачи №7
     * см в Task7
     */
}
