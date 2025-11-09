package Problem3;

/**
 * Class representing a Triangle shape.
 * This class extends the abstract Shape class and provides implementations for area and perimeter calculations.
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 9/11/2025
 */
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Constructor to initialize the triangle with its three sides.
     *
     * @param side1 The length of the first side.
     * @param side2 The length of the second side.
     * @param side3 The length of the third side.
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
     * Checks if the given sides can form a valid triangle.
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    private boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2);
    }

    /**
     * Computes the area of the triangle using Heron's formula.
     *
     * @return The area of the triangle.
     */
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Computes the perimeter of the triangle.
     *
     * @return The perimeter of the triangle.
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}