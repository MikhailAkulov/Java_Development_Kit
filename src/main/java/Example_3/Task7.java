package Example_3;

/**
 * Задача 7.
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает
 * true, если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
 */

public class Task7 {
    public static void main(String[] args) {
        String[] array1 = {"x", "5", "z"};
        String[] array2 = {"x", "7", "z"};
        Integer[] array3 = {1, 2, 3};

        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
    }

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }
}
