package tasks.eleven;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String strFirstNumber = scanner.next();
        int firstNumber = Integer.parseInt(strFirstNumber);
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        int max = Math.max(firstNumber,secondNumber);
        System.out.println("Среди введенных чисел, большее число равно " + max);

        double min = Math.min(firstNumber,secondNumber);
        System.out.println("Среди введенных чисел, меньшее число равно " + min);



    }
}
