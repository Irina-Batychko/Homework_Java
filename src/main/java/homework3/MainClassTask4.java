package homework3;
/*Задача №4*(дополнительная).
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа. */

import java.util.ArrayList;

public class MainClassTask4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Я");
        list.add("студент");
        list.add("GeekBrains");
        list.add("4");
        list.add("5");
        list.add("6");

        for (int i = 0; i < list.size(); i++) {
            if (isInteger(list.get(i))) {
                list.remove(i);
                i--;
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}