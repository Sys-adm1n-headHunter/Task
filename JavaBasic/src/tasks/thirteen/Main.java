package tasks.thirteen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слова, разделенные пробелами: ");

        String text = scanner.nextLine();
        String[] arrayWords = text.split(" ");

        int countWords = 0;
        boolean isLatin;


        for (String word : arrayWords) {
            String trimWord = word.trim();

            if (trimWord.isEmpty()) {
                continue;
            }

            isLatin = true;

            for (int i = 0; i < trimWord.length(); ++i) {
                char c = trimWord.charAt(i);
                if ((c < 'a' || 'z' < c) && (c < 'A' || 'Z' < c)) {
                    isLatin = false;
                    break;
                }
            }

            if (isLatin) {
                countWords++;
                System.out.println(trimWord);
            }

        }
        System.out.println("Количество слов состоящих из латиницы равно: " + countWords);
    }
}

