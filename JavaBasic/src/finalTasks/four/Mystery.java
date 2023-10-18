package finalTasks.four;

import java.util.Scanner;

public class Mystery {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Напишите ответ на загадку.");
        System.out.println("Сейчас можно воспользоваться подсказкой. Для этого необходимо введите слово \"Подсказка\".");
        String answer;
        boolean isUsedHint = false;
        Scanner scanner = new Scanner(System.in);
        int countAttempts = 3;

        for (int numberAttempt = 0; numberAttempt < countAttempts; ++numberAttempt) {
            System.out.print("Попытка " + (numberAttempt + 1) + ": ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            }

            if (isUsedHint) {
                System.out.println("Обидно, приходи в другой раз!");
                return;
            }

            if (answer.equalsIgnoreCase("Подсказка")) {
                if (0 == numberAttempt) {
                    System.out.println("Просто напиши это - \"Заархивированный вирус\"");
                } else {
                    System.out.println("Подсказка уже нельзя воспользоваться!.");
                }
                isUsedHint = true;
                continue;
            }

            if (countAttempts - 1 != numberAttempt) {
                System.out.println("Подумай еще!");
            }
        }

        System.out.println("Обидно, приходи в другой раз!");
    }
}
