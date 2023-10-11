package tasks.five;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        int сorrectnessOperation = 0;
        System.out.println("Необходимо ввести два числа!");
        System.out.println("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();
        System.out.println("Введите необходимую операцию  ‘+’, ‘-’, ‘*’ или ‘/’: ");
        String operation = scanner.next();


        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Делить на ноль нельзя!");
                }
                result = x / y;
                break;
            default:
                System.out.println("Была введена несуществующая операция");
                сorrectnessOperation = 1;
                break;
        }

        if (сorrectnessOperation == 0)
            System.out.println("Результат операции: " + result);

    }
}
