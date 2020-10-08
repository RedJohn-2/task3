package find.area;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Picture picture = new Picture(new Rectangle(-2,-2,2,8), new Circle(-4,-1,4),
                                      new Line(0,4,-2), new Parabola(-0.5,2.5,0.125,0),
                                      new Parabola(-4,-3,-1,0));
        runTests(picture);
        double x = readPointCoordinates("x");
        double y = readPointCoordinates("y");
        printColorForPoint(x,y,picture);

    }

    static double readPointCoordinates(String coordinate) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s ", coordinate);
        return scanner.nextDouble();
    }

    static  void runTests(Picture picture) {
        double[] coordinateX = {-1,-4,-3,-3,1,3,1,3,-1,-3,-1,1.7,3};
        double[] coordinateY = {-1,1,-3,-5,1,1,4,3,4,6,7,1.7,-3};
        for (int i = 0; i < 13; i++) {
            printColorForPoint(coordinateX[i], coordinateY[i], picture);
        }
    }

    static void printColorForPoint(double x, double y, Picture picture)
    {
        System.out.printf("(%.1f, %.1f) -> %S", x, y, picture.getColor(x,y));
        System.out.println();
    }
}


