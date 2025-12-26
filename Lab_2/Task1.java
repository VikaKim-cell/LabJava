package Lab_2;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        int n = 10;
        int[] arr = new int[n];
        Random ran = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = ran.nextInt(199) - 99;
        }

        System.out.println("Массив: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int kol = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                kol++;
            }
        }

        System.out.println("Количество элементов > предыдущего: " + kol);

        double[] obratnye = CreateReciprocalFraction(arr);

        System.out.println("Обратные дроби: ");

        for (int i = 0; i < n; i++) {
            System.out.print((obratnye[i]) + " ");
        }
        System.out.println();

    }


    static double[] CreateReciprocalFraction(int[] arr) {


        double[] res = new double[arr.length];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                res[i] = 1.0 / arr[i];
            }
        }

        return res;
    }

}
