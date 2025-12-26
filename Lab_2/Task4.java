package Lab_2;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int n = 5;
        int[][] matrica = new int[n][n];
        Random ran = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrica[i][j] = ran.nextInt(18) - 9;
            }
        }

        System.out.println("Матрица A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }

        double Result = 1;
        boolean plusOrMinus = false;

        for (int i = 0; i < n - 1; i++) {
            int j = n - 2 - i;
            if (j >= 0 && j < n) {
                if (matrica[i][j] < 0) {
                    Result = Result * matrica[i][j];
                    plusOrMinus = true;
                }
            }
        }

        System.out.println("Результат:");
        if (plusOrMinus) {
            System.out.println(Result);
        } else {
            System.out.println("Все > 0");
        }

    }
}
