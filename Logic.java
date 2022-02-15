package by.training.vnemero.task01;

public class Logic {

    public boolean logicTask1(int a) {
        return ((a / 1000) + ((a / 100) % 10)) == (((a % 100) / 10) + (a % 10));
    }

    public double logicTask2(double a, double b, double c) {
        double x = (b + Math.sqrt((Math.pow(b, 2)) + (4 * a * c))) / (2 * a);
        double y = Math.pow(a, 3) * c;
        return (x - y + Math.pow(b, -2));
    }

    public double logicTask3Perimeter(double x, double y) {
        return (Math.sqrt((x * x) + (y * y)) + x + y);
    }

    public double logicTask3Square(double x, double y) {
        return (0.5 * x * y);
    }

    public boolean logicTask4(int x, int y) {
        return (((x >= -4) & (x <= 4) & (y >= -3) & (y <= 0)) || ((y >= 0) & (y <=4) & (x >= -2) & (x <= 2)));
    }
}
