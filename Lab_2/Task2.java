package Lab_2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int n = 60;
        int[] c = new int[n];
        Random ran = new Random();

        for (int i = 0; i < n; i++) {
            c[i] = ran.nextInt(201) - 100;
        }

        System.out.println("Массив c:");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        int kolvo_notnull = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] != 0) {
                kolvo_notnull++;
            }
        }

        int[] x = new int[kolvo_notnull];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] != 0) {
                x[index] = c[i];
                index++;
            }
        }

        System.out.println("Массив x (без 0):");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        sortBySelection(x);

        System.out.println("Сортированный массив x:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

    }

    static void sortBySelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
