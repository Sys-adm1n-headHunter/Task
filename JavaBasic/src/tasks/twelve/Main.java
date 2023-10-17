package tasks.twelve;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        String text = scanner.nextLine();

        if (text.contains("java") || text.startsWith("I like") || text.endsWith("!!!")) {
            System.out.println(text.toUpperCase());
            String changeText= text.replace('a', 'o');
            System.out.println(changeText.substring(7, 11));
        }


    }
}
