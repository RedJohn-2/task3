package find.area;

public class Circle {
    double a;
    double x0;
    double y0;

    public Circle(double x0, double y0, double a) {
        this.a = a;
        this.x0 = x0;
        this.y0 = y0;
    }

    public boolean isPointInside(double x, double y) {
        return (x-x0) * (x-x0) + (y-y0) * (y-y0) <= a*a;
    }
}
