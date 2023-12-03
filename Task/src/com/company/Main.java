package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] A = {5, 2, 4, 6, 1, 3, 2, 6};
        System.out.println("Массив до сортировки: " + Arrays.toString(A));
        System.out.println("Массив после сортировки: " + Arrays.toString(sort(A)));

    }

    public static int[] sort(int A[]) {
        if (A.length > 1) {
            int q = (int) Math.floor(A.length / 2);
            int firstArray[] = new int[q];
            int SecondArray[] = new int[A.length - q];

            for (int i = 0; i < A.length; i++) {
                if (i < q)
                    firstArray[i] = A[i];
                else
                    SecondArray[i - q] = A[i];
            }

            firstArray = sort(firstArray);
            SecondArray = sort(SecondArray);
            A = sortNext(firstArray, SecondArray);
            return A;
        } else {
            return A;
        }
    }

    public static int[] sortNext(int x[], int y[]) {
        int c[] = new int[x.length + y.length];
        int a = 0, b = 0;

        for (int i = 0; i < x.length + y.length; i++) {
            if (a == x.length) {
                c[i] = y[b];
                b++;
            } else if (b == y.length) {
                c[i] = x[a];
                a++;
            } else if (x[a] > y[b]) {
                c[i] = y[b];
                b++;
            } else {
                c[i] = x[a];
                a++;
            }
        }
        return c;
    }
}
