package tasks.four;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести три числа!");
        System.out.println("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();
        System.out.println("Введите третье число: ");
        double z = scanner.nextDouble();

        double average = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое  введеных чисел: " + average);

        average = average / 2.0;
        System.out.println("Среднее арифметическое деленое на 2: " + average);

        double roundDown = (double) Math.floor(average);
        System.out.println("Округление в меньшую сторону:  " + roundDown);

        if (roundDown > 3.0) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
