package homework1;
/* Задача №3
В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59   */

import java.util.Calendar;
import java.util.Scanner;
public class MainClassTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String name = scanner.nextLine();
        scanner.close();

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        String hello = "";
        if (hour >= 5 && hour < 12) {
            hello = "Доброе утро";
        } else if (hour >= 12 && hour < 18) {
            hello = "Добрый день";
        } else if (hour >= 18 && hour < 23) {
            hello = "Добрый вечер";
        } else {
            hello = "Доброй ночи";
        }

        System.out.printf("%s, %s!", hello, name);
    }
}
