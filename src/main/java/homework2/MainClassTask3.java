package homework2;
/* Задача №3*
Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
        1 Расширение файла: txt
        2 Расширение файла: pdf
        3 Расширение файла:
        4 Расширение файла: jpg
*/

import java.io.File;

public class MainClassTask3 {
    public static void main(String[] args) {
        File currentDirectory = new File("src/main/java/homework2");
        String[] files = currentDirectory.list();

        int index = 1;
        for (String filename : files) {
            int dotIndex = filename.lastIndexOf('.');
            String extension = (dotIndex == -1) ? "" : filename.substring(dotIndex + 1);
            System.out.println(index + " Расширение файла: " + extension);
            index++;
        }
    }
}
