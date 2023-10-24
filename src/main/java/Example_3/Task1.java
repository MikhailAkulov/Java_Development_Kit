package Example_3;

import java.io.*;

/**
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
 */

public class Task1<T extends Comparable, V extends DataInput, K extends Number> {
    T comparableItem;
    V dataItem;
    K numberItem;

    Task1(T comparableItem, V dataItem, K numberItem) {
        this.comparableItem = comparableItem;
        this.dataItem = dataItem;
        this.numberItem = numberItem;
    }

    void getNameClass() {
        System.out.println(comparableItem.getClass().getName());
        System.out.println(dataItem.getClass().getName());
        System.out.println(numberItem.getClass().getName());
    }
}


