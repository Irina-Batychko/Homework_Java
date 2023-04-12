package homework5;
/* Задача №2
Пусть дан список сотрудников:

Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
*/

import java.util.*;

public class MainClassTask2 {
    public static void main(String[] args) {
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов", "Иван Иванов", "Светлана Петрова",
                "Марина Лугова", "Мария Рыкова", "Петр Чернышов"};

        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String employee : employees) {
            if (nameCountMap.containsKey(employee)) {
                nameCountMap.put(employee, nameCountMap.get(employee) + 1);
            } else {
                nameCountMap.put(employee, 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameCountMap.entrySet());
        sortedList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
        }
    }
}