package find.area;

public class Parabola {
    double a;
    double b;
    double c;
    double x0;

    public Parabola(double b, double c, double a, double x0) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x0 = x0;
    }

    public boolean isPointInside(double x, double y) {
        return y >= a * (x + x0) * (x + x0) + b * (x + x0) + c;
    }
}
