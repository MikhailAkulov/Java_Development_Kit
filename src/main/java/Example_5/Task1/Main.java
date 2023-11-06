package Example_5.Task1;

/**
 * Задание 1
 * ● Создать два класс ObjectA, ObjectB
 * ● Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB
 */

public class Main {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();
        ThreadDeadlock threadDeadlock = new ThreadDeadlock();
        threadDeadlock.getThreadBA(objectB, objectA);
        threadDeadlock.getThreadAB(objectA, objectB);
    }
}
