package homework4;
/* Задача №2
Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.*/

import java.util.Collections;
import java.util.LinkedList;

public class MainClassTask2 {
    public static void main(String[] args) {
        LinkedList<String> fruitsList = new LinkedList<>();
        Collections.addAll(fruitsList, "apple", "orange", "banana", "pineapple", "strawberry", "melon");
        System.out.println("Первоначальный список -> " + fruitsList);

        for (int i = 0; i < fruitsList.size() / 2; i++) {
            int j = fruitsList.size() - i - 1;
            String temp = fruitsList.get(i);
            fruitsList.set(i, fruitsList.get(j));
            fruitsList.set(j, temp);
        }
        System.out.println("Перевернутый список -> " + fruitsList);
    }
}