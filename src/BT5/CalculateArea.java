package src.BT5;

// Khai báo class chứa các hàm method 
public class CalculateArea {

    public static double areaOfRectangle(double a, double b) {
        return a * b;
    }

    public static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }

    public static Double areaOfTriangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return null;
        }
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

