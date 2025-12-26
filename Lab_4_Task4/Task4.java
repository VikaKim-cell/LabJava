package Lab_4_Task4;

public class Task4 {
    public static void main(String[] args) {

        Point pt1 = new Point(2, 3);
        Point pt2 = new Point(8, 5);

        System.out.println("Точка 1: " + pt1);
        System.out.println("Точка 2: " + pt2);

        Point normal = pt1.getNormalVector(pt2);
        System.out.println("Нормальный вектор: " + normal);

        System.out.println("");

        Point3D v1 = new Point3D(1, 2, 3);
        Point3D v2 = new Point3D(4, 5, 6);

        System.out.println("Вектор 1: " + v1);
        System.out.println("Вектор 2: " + v2);

        Point3D cross = new Point3D();
        Point3D crossResult = cross.getCrossProduct(v1, v2);
        System.out.println("Векторное произведение: " + crossResult);
    }
}
