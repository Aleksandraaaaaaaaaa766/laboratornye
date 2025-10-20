package lab2;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

//    public Point() {
//        this.x = 0;
//        this.y = 0;
//    }

    public Point(double x1, double y1, double z1) {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; //если оба объекта ссылаются на одно и то же
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }
    @Override
    public String toString() {
        return "{" + this.x + ";" + this.y + "}";
    }
}
