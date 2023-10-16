package tasks.fourteen;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[15];
        int min = 20;
        int max = -20;

        //Заполнение массива рандомными значениями
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 42 - 21);
        }
        System.out.println(Arrays.toString(array));

        //Получение минимального и максимального значений
        for (int j : array) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        //Получение большего по модулю
        int maxAbs = Math.max(Math.abs(min), Math.abs(max));

        System.out.println("Минимальный элемент массива равен " + min);
        System.out.println("Максимальный  элемент массива равен " + max);
        System.out.println("Наибольшее значение по по модулю равно " + maxAbs);


    }
}
