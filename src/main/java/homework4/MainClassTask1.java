package homework4;
/* Задача №1.
Реализовать консольное приложение, которое: Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.*/

import java.util.LinkedList;
import java.util.Scanner;

public class MainClassTask1 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите пожалуйста строку:  ");
            String input = scanner.nextLine();

            if (input.equals("print")) {
                for (int i = strings.size() - 1; i >= 0; i--) {
                    System.out.println(strings.get(i));
                }
            } else if (input.equals("revert")) {
                if (strings.size() > 0) {
                    strings.removeLast();
                }
            } else {
                strings.add(input);
            }
        }
    }
}

