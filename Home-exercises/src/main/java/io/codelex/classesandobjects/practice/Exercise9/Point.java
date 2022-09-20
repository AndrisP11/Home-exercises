package io.codelex.classesandobjects.practice.Exercise9;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    public static void swapPoints(Point a, Point b) {
        Point temp = new Point(0, 0);

        temp.setX(a.getX());
        temp.setY(a.getY());
        a.setX(b.getX());
        a.setY(b.getY());
        b.setX(temp.getX());
        b.setY(temp.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
