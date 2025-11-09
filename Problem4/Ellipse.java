package Problem4;

/**
 * Class representing an Ellipse.
 */
public class Ellipse extends Shape {
    protected double a; // major axis
    protected double b; // minor axis

    /**
     * Constructor for Ellipse.
     * Assigns larger value to a and smaller to b.
     * 
     * @param name Name of the ellipse
     * @param axis1 first axis length
     * @param axis2 second axis length
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
     * Calculates the area of the ellipse.
     * @return area as double
     */
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    /**
     * Calculates the perimeter of the ellipse using Ramanujan's approximation.
     * @return perimeter as double
     * 
     */
    @Override
    public double getPerimeter() {
        if (a == b) { // circle case
            return 2 * Math.PI * a;
        }
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    }

    /**
     * Scales the ellipse by the given factor.
     * @param factor the scale factor to apply
     */
    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}

