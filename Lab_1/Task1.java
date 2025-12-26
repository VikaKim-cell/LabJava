package Lab_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        double result;

        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("b: ");
        double b = sc2.nextDouble();

        double proizvedenie = a * b;

        if (proizvedenie > 30) {
            double kot = Math.cos(a) / Math.sin(a);
            result = 2 * kot;
            System.out.println("Произведение > 30, результат: " + result);
        } else {
            result = a / 2;
            System.out.println("Произведение <= 30, результат: " + result);
        }

    }

}
