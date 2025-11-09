package Problem3;

/**
 * Class representing a Circle shape.
 * This class extends the abstract Shape class and provides implementations for area and perimeter calculations.
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 9/11/2025
 */
public class Circle extends Ellipse {

    /**
     * Constructor to initialize the circle with its radius.
     *
     * @param radius The radius of the circle.
     */
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }
}
