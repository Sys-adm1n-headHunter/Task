package tasks.eight;

import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое положительное число: ");
        int positiveNumber = scanner.nextInt();
        int sum = 0;

        if (positiveNumber >= 0) {
            for (int i = 0; i < positiveNumber; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println("Сумма нечетных чисел от 1 до " + positiveNumber + " равна " + sum);

        } else {
            System.out.println("Некорректный параметр!");
        }


    }
}
