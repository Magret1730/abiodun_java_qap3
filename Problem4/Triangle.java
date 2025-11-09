package Problem4;

/**
 * Class representing a general Triangle
 */
public class Triangle extends Shape {
    protected double side1, side2, side3;

    /**
     * Constructor for Triangle
     * Checks validity of triangle sides
     * 
     * @param name Name of the triangle
     * @param side1 first side length
     * @param side2 second side length
     * @param side3 third side length
     */
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);

        if (!isValidTriangle(side1, side2, side3)) {
            System.out.println("Error: Invalid triangle sides.");
            System.exit(1); // terminate program
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Validates if the given sides can form a triangle
     * 
     * @param s1 first side length
     * @param s2 second side length
     * @param s3 third side length
     * @return true if valid triangle, false otherwise
     */
    private boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2);
    }

    /**
     * Calculates the perimeter of the triangle
     * 
     * @return perimeter as double
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Calculates the area of the triangle using Heron's formula
     * 
     * @return area as double
     */
    @Override
    public double getArea() {
        double s = getPerimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Scales the triangle by the given factor.
     * 
     * @param factor the scale factor to apply
     */
    @Override
    public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}

