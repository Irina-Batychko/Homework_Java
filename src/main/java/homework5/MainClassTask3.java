package homework5;
/* Задача №3*** (дополнительная)
Написать метод, который переведёт данное целое число в римский формат.
*/

import java.util.HashMap;
import java.util.Scanner;

public class MainClassTask3 {
    private static final HashMap<Integer, String> SYMBOL_MEANING = new HashMap<>();

    static {
        SYMBOL_MEANING.put(1, "I");
        SYMBOL_MEANING.put(4, "IV");
        SYMBOL_MEANING.put(5, "V");
        SYMBOL_MEANING.put(9, "IX");
        SYMBOL_MEANING.put(10, "X");
        SYMBOL_MEANING.put(40, "XL");
        SYMBOL_MEANING.put(50, "L");
        SYMBOL_MEANING.put(90, "XC");
        SYMBOL_MEANING.put(100, "C");
        SYMBOL_MEANING.put(400, "CD");
        SYMBOL_MEANING.put(500, "D");
        SYMBOL_MEANING.put(900, "CM");
        SYMBOL_MEANING.put(1000, "M");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number <= 0 || number > 2999) {
            System.out.println("Число должно быть в диапазоне от 1 до 2999");
            return;
        }
        String roman = intToRoman(number);
        System.out.printf("Римское представление числа %d: %s%n", number, roman);
    }

    public static String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int value : values) {
            while (num >= value) {
                num -= value;
                roman.append(SYMBOL_MEANING.get(value));
            }
        }
        return roman.toString();
    }
}
