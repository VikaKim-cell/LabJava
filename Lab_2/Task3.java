package Lab_2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int m = 4;
        int n = 5;
        int[][] matrica = new int[m][n];
        Random ran = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrica[i][j] = ran.nextInt(18) - 9;
            }
        }

        System.out.println("Матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }

        int[] vectorB = new int[n];

        for (int j = 0; j < n; j++) {

            int summa = 0;

            for (int i = 0; i < m; i++) {
                if (matrica[i][j] > 0) {
                    summa += matrica[i][j];
                }
            }

            vectorB[j] = summa;

        }

        System.out.println("Вектор B:");
        for (int j = 0; j < n; j++) {
            System.out.print(vectorB[j] + " ");
        }
        System.out.println();

    }
}
