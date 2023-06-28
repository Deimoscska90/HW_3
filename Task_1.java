// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(24);
        numbers.add(15);
        numbers.add(87);
        numbers.add(32);
        numbers.add(1);
        numbers.add(76);
        numbers.add(88);

        System.out.println("Список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + numbers);

    }
}
