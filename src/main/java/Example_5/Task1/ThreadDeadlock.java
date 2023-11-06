package Example_5.Task1;

/**
 * Задание 1
 * ● Создать два класс ObjectA, ObjectB
 * ● Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB
 */

class ThreadDeadlock {
    void getThreadAB(ObjectA objectA, ObjectB objectB) {
        new Thread(() -> {
            System.out.println("run: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            objectA.stepOne(objectB);
        }).start();
    }

    void getThreadBA(ObjectB objectB, ObjectA objectA) {
        new Thread(() -> {
            System.out.println("run: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            objectB.stepOne(objectA);
        }).start();
    }
}
