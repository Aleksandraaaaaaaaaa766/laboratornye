package lab3.Figure.task4_4;

import lab2.Point;

public class Circle extends Shape {

    private double radius;

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Конструктор по умолчанию: единичная окружность в центре
    public Circle() {
        this(new Point(0, 0), 1);
    }

    public Circle(Point point, double radius) {
        super(point);
        setRadius(radius);
    }

    public Circle(double x, double y, double radius) {
        this(new Point(x, y), radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг: " +
                "центр = " + getPoint() +
                ", radius = " + radius;
    }
}
