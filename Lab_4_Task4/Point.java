package Lab_4_Task4;

public class Point {

    public int x;
    public int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point getNormalVector(Point other) {
        int vx = other.x - this.x;
        int vy = other.y - this.y;

        int nx = -vy;
        int ny = vx;

        Point normalPoint = new Point(nx, ny);
        return normalPoint;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

}

