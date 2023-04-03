package homework2;
/*Задача №1.
Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
(возвращает boolean значение).*/

import java.util.Scanner;

public class MainClassTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пожалуйста строку: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Эта строка является палиндромом!");
        } else {
            System.out.println("Эта строка не является палиндромом!");
        }
    }
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
}