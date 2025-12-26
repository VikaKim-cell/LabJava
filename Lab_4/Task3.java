package Lab_4;

public class Task3 {
    public static void main(String[] args) {

        Point p = new Point(7, 9);
        System.out.println("Точка 2D: " + p);
        System.out.println("Расстояние до 0: " + p.distanceFromOrigin());

        Point leftUp = new Point(2, 3);
        Point rightDown = new Point(15, 15);
        boolean inRect = p.isInRectangle(leftUp, rightDown);
        System.out.println("Внутри Квадрата: " + inRect);

        Point circPos = new Point(8, 10);
        boolean inCirc = p.isInCircle(circPos, 6);
        System.out.println("Внутри Круга: " + inCirc);

        System.out.println();

        Point3D p3 = new Point3D(7, 9, 5);
        System.out.println("Точка 3D: " + p3);
        System.out.println("Расстояние до 0: " + p3.distanceFromOrigin());

        Point3D c1 = new Point3D(1, 1, 1);
        Point3D c2 = new Point3D(20, 20, 20);
        boolean inBox = p3.isInBox(c1, c2);
        System.out.println("Внутри Куба: " + inBox);

        Point3D sCenter = new Point3D(7, 9, 5);
        boolean inSph = p3.isInSphere(sCenter, 7);
        System.out.println("Внутри Сферы: " + inSph);

    }
}
