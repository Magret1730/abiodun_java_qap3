package Problem3;

/**
 * Class representing an Equilateral Triangle
 * All sides are equal
 */
public class EquilateralTriangle extends Triangle {

    /**
     * Constructor to initialize the equilateral triangle with its side length.
     * @param name
     * @param side
     */
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }
}
