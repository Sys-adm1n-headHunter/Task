package tasks.nine;

import java.util.Arrays;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        double average = 0;

        if (arraySize >= 0) {
            double[] arrayData = new double[arraySize];
            System.out.println("Введите данные массива: ");


            for (int i = 0; i < arraySize; i++) {
                System.out.println(i + 1 + "й элемент массива из " + arraySize + ": ");
                arrayData[i] = scanner.nextDouble();
                average += arrayData[i];
            }

            //Находим  среднее арифметическое
            average = average / arraySize;

            //Умножение каждого элемента массива на среднее арифметическое
            for (int i = 0; i < arraySize; i++) {
                arrayData[i] = arrayData[i] * average;
            }

            //Вывод массива умноженного на среднее арифметическое
            System.out.println(Arrays.toString(arrayData));


        } else {
            System.out.println("Некорретное значение!");
        }
    }
}
