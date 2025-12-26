package Lab_4;

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

    public int distanceFromOrigin() {
        int xSquared = this.x * this.x;
        int ySquared = this.y * this.y;
        return (int) Math.sqrt(xSquared + ySquared);
    }

    public boolean isInRectangle(Point top_left, Point bottom_right) {
        boolean inX = false;
        boolean inY = false;

        if (this.x >= top_left.x && this.x <= bottom_right.x) {
            inX = true;
        }

        if (this.y >= top_left.y && this.y <= bottom_right.y) {
            inY = true;
        }

        if (inX && inY) {
            return true;
        }
        return false;
    }

    public boolean isInCircle(Point center, int radius) {
        int dX = this.x - center.x;
        int dY = this.y - center.y;
        int distSq = dX * dX + dY * dY;
        int radSq = radius * radius;

        if (distSq <= radSq) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

}

