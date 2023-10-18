package finalTasks.three;

import java.util.Arrays;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        int numberLine = -1;
        int maxCharDifference = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите необходимое количество строк: ");
        int numberLines = scanner.nextInt();


        if (numberLines > 0) {
            String[] lines = new String[numberLines];


            for (int i = 0; i < numberLines; ++i) {
                System.out.print("Введите строку №" + (i + 1) + ": ");
                lines[i] = scanner.next();
            }

            for (int i = 0; i < numberLines; ++i) {
                char[] chars = lines[i].toCharArray();
                Arrays.sort(chars);
                int countCharDifference = 0;
                char lastCharDifference = '\0';

                for (char c : chars) {
                    if (lastCharDifference != c) {
                        lastCharDifference = c;
                        ++countCharDifference;
                    }
                }

                if (maxCharDifference < countCharDifference) {
                    maxCharDifference = countCharDifference;
                    numberLine = i;
                }
            }

            System.out.println("Ответ: " + lines[numberLine]);

        } else {
            System.out.println("Некорректно введенный параметр!");
        }
    }
}