package tasks.seven;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        int x = 5;
        int y = -23;
        int z = 999;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        if (arraySize >= 0) {
            int[] arrayData = new int[arraySize];
            System.out.println("Введите данные массива: ");

            for (int i = 0; i < arraySize; i++) {
                System.out.println(i + 1 + "й элемент массива из " + arraySize + ": ");
                arrayData[i] = scanner.nextInt();

                if (x == arrayData[i] || y == arrayData[i] || z == arrayData[i]) {
                    System.out.println("Данное значение имеется в константах");
                }
            }
        }else{
            System.out.println("Некорретное значение!");
        }
    }
}
