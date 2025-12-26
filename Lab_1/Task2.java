package Lab_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("b: ");
        double b = sc2.nextDouble();

        double d = (Math.min(a, 3 * b) - 2 * Math.sqrt(Math.max(a, 3 * b))) / (Math.pow(4, 3) + Math.max(a, 3 * b) / Math.min(a, b));

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("d = " + d);

    }


}
