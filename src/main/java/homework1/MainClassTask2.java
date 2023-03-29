package homework1;
/*Задача №2
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.*/

import java.util.Arrays;
public class MainClassTask2 {
public static void main(String[] args) {
    int[] arr = {3, 2, 2, 3};
    int val = 3;
    int insertIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[insertIndex] = arr[i];
                insertIndex++;
            }
        }
        while (insertIndex < arr.length) {
            arr[insertIndex] = val;
            insertIndex++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
