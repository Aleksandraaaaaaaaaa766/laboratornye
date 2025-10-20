package lab3.Figure.task4_4;

import lab2.Point;

public class Square extends Shape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона должна быть положительной");
        }
        this.side = side;
    }

    // Конструктор по умолчанию: квадрат из начала координат со стороной 1
    public Square() {
        this(new Point(0, 0), 1);
    }

    public Square(Point point, double side) {
        super(point);
        setSide(side);
    }

    public Square(double x, double y, double side) {
        this(new Point(x, y), side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Квадрат: " +
                "правая верхняя точка = " + getPoint() +
                ", сторона = " + side;
    }
}
