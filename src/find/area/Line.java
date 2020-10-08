package find.area;

public class Line {
    private double a;
    private double x0;
    private double y0;

    public Line(double x0, double y0, double a) {
        this.a = a;
        this.x0 = x0;
        this.y0 = y0;
    }

    public boolean isPointInside(double x, double y) {
        return y >= a * (x + x0) + y0;
    }
}
