package finalTasks.one;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double rubleExchange = scanner.nextDouble();
        System.out.print("Количество рублей: ");
        double rubles = scanner.nextDouble();

        System.out.printf("Итого: %.2f долларов", rubles / rubleExchange);
    }
}
