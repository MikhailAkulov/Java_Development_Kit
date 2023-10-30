package Example_4;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Задание 1. Создать справочник сотрудников
 * Необходимо:
 * ● Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
 * каждый сотрудник должен иметь следующие атрибуты:
 * ○ Табельный номер
 * ○ Номер телефона
 * ○ Имя
 * ○ Стаж
 * ● Добавить метод, который ищет сотрудника по стажу (может быть список)
 * ● Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
 * ● Добавить метод, который ищет сотрудника по табельному номеру
 * ● Добавить метод добавление нового сотрудника в справочник
 */

public class Main {

    public static void main(String[] args) {
        NoteEmployee note = new NoteEmployee();
        Employee emp1 = new Employee("123456", "user1", LocalDateTime.of(2018, Month.JANUARY,8, 16, 32));
        Employee emp2 = new Employee("123457", "user2", LocalDateTime.of(2020, Month.FEBRUARY,8, 16, 32));
        Employee emp3 = new Employee("123458", "user3", LocalDateTime.of(2020, Month.MARCH,8, 16, 32));
        Employee emp4 = new Employee("123459", "user4", LocalDateTime.of(2021, Month.APRIL,8, 16, 32));
        Employee emp5 = new Employee("123460", "user5", LocalDateTime.of(2022, Month.MAY,8, 16, 32));
        note.add(emp1);
        note.add(emp2);
        note.add(emp3);
        note.add(emp4);
        note.add(emp5);

        // метод, который ищет сотрудника по стажу (может быть список)
        System.out.println("\n" + note.getEmployeeByStaj(3) + "\n");

        // метод, который выводит номер телефона сотрудника по имени (может быть список)
        System.out.println(note.getPhone("user4") + "\n");

        // метод, который ищет сотрудника по табельному номеру
        System.out.println(note.getEmployeeById(5));
    }
}
