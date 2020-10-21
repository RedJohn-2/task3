package find.area;

public class Picture {
    Rectangle rectangle;
    Circle circle;
    Line line;
    Parabola parabola1;
    Parabola parabola2;

    public Picture(Rectangle rectangle, Circle circle, Line line, Parabola parabola1, Parabola parabola2) {
        this.rectangle = rectangle;
        this.circle = circle;
        this.line = line;
        this.parabola1 = parabola1;
        this.parabola2 = parabola2;
    }

    public SimpleColor getColor(double x, double y) {
        if (rectangle.isPointInside(x,y) && !parabola2.isPointInside(x,y))
            return SimpleColor.WHITE;
        if (rectangle.isPointInside(x,y) && parabola1.isPointInside(x,y) && !line.isPointInside(x,y))
            return SimpleColor.ORANGE;
        if ((rectangle.isPointInside(x,y) && !parabola1.isPointInside(x,y) && !circle.isPointInside(x,y))
           || (line.isPointInside(x,y) && parabola1.isPointInside(x,y) && !rectangle.isPointInside(x,y)))
            return SimpleColor.GREEN;
        if (circle.isPointInside(x,y) || rectangle.isPointInside(x,y) || parabola1.isPointInside(x,y)
           || line.isPointInside(x,y))
            return SimpleColor.BLUE;
        if (!parabola2.isPointInside(x,y))
            return SimpleColor.YELLOW;
        return SimpleColor.GRAY;
    }
}
