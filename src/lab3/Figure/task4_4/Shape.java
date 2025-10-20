package lab3.Figure.task4_4;

import lab2.Point;

public abstract class Shape {
    private Point point; //у всех фигур есть точка

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        if (point == null) {
            throw new IllegalArgumentException("Point не может быть null");
        }
        this.point = point;
    }

    public Shape(Point point) {
        setPoint(point);
    }

    public abstract double area();
}
