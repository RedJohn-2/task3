package find.area;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Picture picture = new Picture(new Rectangle(-2,-2,2,8), new Circle(-4,-1,4),
                                      new Line(0,4,-2), new Parabola(-0.5,2.5,0.125,0),
                                      new Parabola(-4,-3,-1,0));
        boolean tests = runTests(picture);
        if (tests) {
            double x = readPointCoordinates("x");
            double y = readPointCoordinates("y");
            printColorForPoint(x, y, picture);
        }
    }

    static double readPointCoordinates(String coordinate) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %s ", coordinate);
        return scanner.nextDouble();
    }

    static boolean runTests(Picture picture) {
        Point[] coordinateArr = {new Point(-1,-1), new Point(-4,1), new Point(-3,-5),
                              new Point(1,1), new Point(3,1), new Point(1,4),
                              new Point(3,3), new Point(-1,4), new Point(3,-3)};

        SimpleColor[] correctResultArr = {SimpleColor.WHITE, SimpleColor.BLUE, SimpleColor.YELLOW, SimpleColor.GREEN,
                                          SimpleColor.BLUE, SimpleColor.BLUE, SimpleColor.GREEN,SimpleColor.ORANGE,
                                          SimpleColor.GRAY};
        boolean result = true;
        for (int i = 0; i < coordinateArr.length; i++) {
            if (correctResultArr[i] == picture.getColor(coordinateArr[i].x, coordinateArr[i].y)) {
                printTest(coordinateArr, i, picture, "correct");
            } else {
                printTest(coordinateArr, i, picture, "incorrect");
                result = false;
            }
        }
        return result;
    }

    static void printTest(Point[] coordinateArr, int i, Picture picture, String result) {
        System.out.printf("(%.1f, %.1f) -> %S %s\n", coordinateArr[i].x, coordinateArr[i].y,
                          picture.getColor(coordinateArr[i].x,coordinateArr[i].y), result);
    }

    static void printColorForPoint(double x, double y, Picture picture) {
        System.out.printf("(%.1f, %.1f) -> %S\n", x, y, picture.getColor(x,y));
    }
}


