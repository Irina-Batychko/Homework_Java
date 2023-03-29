package homework1;
/*Задача №1
Задать одномерный массив и найти в нем минимальный и максимальный элементы. */
public class MainClassTask1 {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 2, 4, 8, 1, 6, 7};
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент -> " + min);
        System.out.println("Максимальный элемент -> " + max);
    }
}
