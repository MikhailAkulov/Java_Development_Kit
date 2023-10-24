package Example_3.Task6;

/**
 * Задача 6.
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(123, 5L));
        System.out.println(Calculator.multiply(123, 5L));
        System.out.println(Calculator.divide(123, 5L));
        System.out.println(Calculator.subtract(123, 5L));
    }
}
