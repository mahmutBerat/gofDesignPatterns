/**
 * Created by Mahmut on 12/30/2017.
 */
public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        Roots roots = new Roots((-b+Math.sqrt(Math.pow(b,2.0) - (4*a*c)) ) / (2*a),
                (-b-Math.sqrt(Math.pow(b,2.0) - (4*a*c)) ) / (2*a));
        return roots;
    }

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}