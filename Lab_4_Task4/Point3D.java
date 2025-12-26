package Lab_4_Task4;

public class Point3D extends Point {

    public int z;

    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getZ() {
        return this.z;
    }

    public Point3D getCrossProduct(Point3D vec1, Point3D vec2) {
        int compX = vec1.y * vec2.z - vec1.z * vec2.y;
        int compY = vec1.z * vec2.x - vec1.x * vec2.z;
        int compZ = vec1.x * vec2.y - vec1.y * vec2.x;

        Point3D result = new Point3D(compX, compY, compZ);
        return result;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }

}

