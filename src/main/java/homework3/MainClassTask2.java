package homework3;
/* Задача №2.
Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее арифметическое из этого списка. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainClassTask2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        int min = Collections.min(list);
        int max = Collections.max(list);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = (double) sum / list.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}