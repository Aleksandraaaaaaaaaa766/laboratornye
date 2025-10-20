package lab3.Figure.task4_4;

import lab2.Point;

public class Rectangle extends Square {
    private double side2;

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона должна быть положительной");
        }
        this.side2 = side;
    }

    // Конструктор по умолчанию: прямоугольник из центра со сторонами 1 и 2
    public Rectangle() {
        this(new Point(0, 0), 1, 2);
    }

    public Rectangle(Point point, double side, double side2) {
        super(point, side);
        setSide2(side2);
    }

    public Rectangle(double x, double y, double side, double side2) {
        this(new Point(x, y), side, side2);
    }

    @Override
    public double area() {
        return getSide() * side2;
    }

    @Override
    public String toString() {
        return "Прямоугольник: " +
                "правая верхняя точка = " + getPoint() +
                ", первая сторона = " + getSide()+
                ", вторая сторона = " + side2;
    }
}
