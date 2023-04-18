package homework6;
/*
Задача №2.
Создать множество ноутбуков (ArrayList).
Задача №3.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
Выводить только те ноутбуки, что соответствуют условию.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MainClassTaskLaptop {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Lenovo", "Ideapad", 750.0, 8, 512, "Intel Core i5", "Белый"));
        laptops.add(new Laptop("HP", "Pavilion", 980.0, 16, 1024, "Intel Core i7", "Серебристый"));
        laptops.add(new Laptop("Dell", "Inspiron", 650.0, 4, 256, "Intel Celeron", "Красный"));
        laptops.add(new Laptop("Asus", "VivoBook", 870.0, 12, 512, "AMD Ryzen 5", "Серый"));
        laptops.add(new Laptop("Acer", "Aspire", 550.0, 8, 256, "Intel Core i3", "Белый"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите минимальный размер RAM: ");
        int minRamSize = scanner.nextInt();

        System.out.print("Введите цвет ноутбука: ");
        String color = scanner.next();

        ArrayList<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getRamSize() >= minRamSize && laptop.getColor().toLowerCase().equals(color.toLowerCase())) {
                filteredLaptops.add(laptop);
            }
        }

        System.out.println("Отфильтрованные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop.toString());
        }
    }
}