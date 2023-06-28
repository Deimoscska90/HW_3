// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
// и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class Task_2_3_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(23);
        list.add(43);
        list.add(10);
        list.add(75);
        list.add(16);
        list.add(42);

        System.out.println("Список: " + list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
