package Lab_1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x: ");
        double x = sc.nextDouble();

        double Y;
        double F;


        if (x <= 1) {
            Y = Math.pow(x, 5) + Math.atan(8 * x);
        } else if (x <= 2) {
            Y = 5 * x - (1 + Math.pow(3, x));
        } else {
            Y = 1 / Math.tan(2 * x + 1);
        }

        if (x <= 1) {
            F = Math.exp(Math.tan(x + 1));
        } else if (x <= 2) {
            F = Math.pow(x, 4) - Math.tan(4 * x);
        } else {
            F = 1 / Math.pow(x, 0.25);
        }



        System.out.println("x = " + x);
        System.out.println("Y = " + Y);
        System.out.println("F = " + F);





    }

}
