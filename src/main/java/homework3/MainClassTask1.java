package homework3;
/* Задача №1.
Пусть дан произвольный список целых чисел, удалить из него четные числа
(в языке уже есть что-то готовое для этого)*/

import java.util.ArrayList;
import java.util.Scanner;

public class MainClassTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Введите пожалуйста целые числа через пробел: ");
        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.print("Оставшиеся (нечетные) числа -> ");
        for (int number : list) {
            System.out.print(number + " ");
        }
    }
}