package Lab_4;

public class Task2 {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, 1);
        ComplexNumber c3 = new ComplexNumber(-2, 3);

        System.out.println("Число: " + c1);
        System.out.println("Радианы: " + c1.getArgument());
        System.out.println("Градусы: " + Math.toDegrees(c1.getArgument()));
        System.out.println();
        System.out.println("Число: " + c2);
        System.out.println("Радианы: " + c2.getArgument());
        System.out.println("Градусы: " + Math.toDegrees(c2.getArgument()));
        System.out.println();
        System.out.println("Число: " + c3);
        System.out.println("Rad: " + c3.getArgument());
        System.out.println("Градусы: " + Math.toDegrees(c3.getArgument()));

    }
}
