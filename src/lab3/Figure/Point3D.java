package lab3.Figure;

public class Point3D extends lab2.Point {
    private double z;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "{" + getX() + "; " + getY() + "; " + this.z+ "}";
    }
}
