package lab3.Figure.task4_4;

import lab2.Point;

public class Triangle extends Shape {
    private Point point2;
    private Point point3;

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Triangle(Point point1, Point point2, Point point3) {
        super(point1);
        setPoint2(point2);
        setPoint3(point3);
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    }

    @Override
    public double area() {
        double length1 = lenghtSegment(getPoint(), point2);
        double lenght2 = lenghtSegment(getPoint(), point3);
        double lenght3 = lenghtSegment(point2, point3);
        double per = lenght3 + lenght2 + length1;
        double polPer = per / 2;
        return Math.sqrt(polPer * (polPer - length1) * (polPer - lenght2) * (polPer - lenght3));
    }

    private double lenghtSegment(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));
    }

    @Override
    public String toString() {
        return "Треугольник: " +
                "первая точка = " + getPoint() +
                ", вторая точка = " + point2 +
                ", третяя точка = " + point3;
    }
}
