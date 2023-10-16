package tasks.ten;

import java.util.Arrays;
import java.util.Scanner;

public class Cycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы: ");
        int matrixRow = scanner.nextInt();
        System.out.println("Введите количество стобцов матрицы: ");
        int matrixColumn = scanner.nextInt();


        if (matrixRow > 0 && matrixColumn > 0) {
            System.out.println("Введите данные матрицы: ");
            double[][] matrix = new double[matrixRow][matrixColumn];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    double matrixDate = scanner.nextDouble();
                    matrix[i][j] = matrixDate;
                }
            }

            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] *= 3;
            }

            System.out.println("Вывод первой строки матрицы, где каждый элемент умножается на 3: " + Arrays.toString(matrix[0]));

        } else {
            System.out.println("Некорректный параметр!");
        }
    }
}
