package util;

public final class Geometric {

    public static double circumference(double radius) {
        return 2.0 * Math.PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 2) * radius / 3.0;
    }

}
