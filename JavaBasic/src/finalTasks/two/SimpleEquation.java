package finalTasks.two;

import java.util.Scanner;

public class SimpleEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int POS_RES = 4; // Позиция результата выражения


        System.out.println("Введите уравнение которое необходимо решить:");
        String equation = scanner.nextLine();

        if (equation.length() < 5) {
            System.out.println("Вы ввели некорректный данные. Строка должна быть длиной 5 символов.");
            return;
        }

        char operation = equation.charAt(1);
        char equals = equation.charAt(3);

        if (('+' == operation || '-' == operation) && '=' == equals) {
            String strValue1 = equation.substring(0, 1);
            String strValue2 = equation.substring(1 + 1, 3);
            String stringResult = equation.substring(3 + 1, 3 + 2);

            int value1 = 0;
            int value2 = 0;
            int valueResult = 0;
            int valueX = 0;

            int positionX = -1; // Позиция неизвестного в уравнении
            int countX = 0;  // Количество неизвестных в уравнении

            if ('x' != strValue1.charAt(0)) { // Неизвестное НЕ в первом значении уравнения
                if (!Character.isDigit(strValue1.charAt(0))) {
                    System.out.println("Вы ввели уравнение в неверном формате. Первое значение в уравнении должно быть цифрой или латинской буквой 'x'.");
                    return;
                }
                value1 = Integer.parseInt(strValue1);
            } else {
                positionX = 0;
                ++countX;
            }

            if ('x' != strValue2.charAt(0)) { // Неизвестное НЕ во втором значении уравнения
                if (!Character.isDigit(strValue2.charAt(0))) {
                    System.out.println("Вы ввели уравнение в неверном формате. Второе значение в уравнении должно быть цифрой или латинской буквой 'x'.");
                    return;
                }
                value2 = Integer.parseInt(strValue2);
            } else {
                positionX = 2;
                ++countX;
            }

            if ('x' != stringResult.charAt(0)) { // Неизвестное НЕ в результате уравнения
                if (!Character.isDigit(stringResult.charAt(0))) {
                    System.out.println("Вы ввели уравнение в неверном формате. Результирующее значение уравнения должно быть цифрой или латинской буквой 'x'.");
                    return;
                }
                valueResult = Integer.parseInt(stringResult);
            } else {
                positionX = 4;
                ++countX;
            }

            // Проверка, что в уравнении задано только одно неизвестное
            if (0 == countX) {
                System.out.println("Вы не задали неизвестное.");
                return;
            }
            if (1 < countX) {
                System.out.println("Вы ввели слишком много неизвестных.");
                return;
            }

            if ('-' == operation && 2 != positionX) {
                value2 *= -1;
            }

            switch (positionX) {
                case 0:
                    valueX = calculate('-', valueResult, value2);
                    break;
                case 2:
                    valueX = calculate('-', valueResult, value1);
                    if ('-' == operation) {
                        valueX *= -1;
                    }
                    break;
                case 4:
                    valueX = calculate('+', value1, value2);
                    break;
            }

            System.out.println("x = " + valueX);
        }else{
            System.out.println("Некорректно введенные параметры!");
        }

    }

    static int calculate(char operation, int value1, int value2) {
        int result = 0;
        switch (operation) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
        }
        return result;
    }
}
