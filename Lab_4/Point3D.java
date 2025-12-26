package Lab_4;

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

    public int distanceFromOrigin() {
        int xSq = this.x * this.x;
        int ySq = this.y * this.y;
        int zSq = this.z * this.z;
        return (int) Math.sqrt(xSq + ySq + zSq);
    }

    public boolean isInBox(Point3D corner1, Point3D corner2) {
        boolean xCheck = false;
        boolean yCheck = false;
        boolean zCheck = false;

        if (this.x >= corner1.x && this.x <= corner2.x) {
            xCheck = true;
        }

        if (this.y >= corner1.y && this.y <= corner2.y) {
            yCheck = true;
        }

        if (this.z >= corner1.z && this.z <= corner2.z) {
            zCheck = true;
        }

        if (xCheck && yCheck && zCheck) {
            return true;
        }
        return false;
    }

    public boolean isInSphere(Point3D center, int radius) {
        int shiftX = this.x - center.x;
        int shiftY = this.y - center.y;
        int shiftZ = this.z - center.z;
        int sumSq = shiftX * shiftX + shiftY * shiftY + shiftZ * shiftZ;
        int rSq = radius * radius;

        if (sumSq <= rSq) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }

}

