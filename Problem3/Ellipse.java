package Problem3;

/**
 * Class representing an Ellipse shape.
 * This class extends the abstract Shape class and provides implementations for area and perimeter calculations.
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 9/11/2025
 */
public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis
    private static final double PI = Math.PI;

    /**
     * Constructor to initialize the ellipse with its major and minor axes.
     * The larger value is assigned to 'a' and the smaller to 'b'.
     *
     * @param axis1 The length of one axis.
     * @param axis2 The length of the other axis.
     */
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    /**
     * Computes the area of the ellipse.
     *
     * @return The area of the ellipse.
     */
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    /**
     * Computes the perimeter of the ellipse using an approximation formula.
     *
     * @return The perimeter of the ellipse.
     */
    @Override
    public double getPerimeter() {
        if (a == b) { // circle
            return 2 * Math.PI * a;
        }
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    }
}
