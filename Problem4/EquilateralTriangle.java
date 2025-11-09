package Problem4;

/**
 * Class representing an Equilateral Triangle
 * All sides are equal
 */
public class EquilateralTriangle extends Triangle {

    /**
     * Constructor for EquilateralTriangle
     * 
     * @param name Name of the triangle
     * @param side Length of each side
     */
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    /**
     * Scales the equilateral triangle by the given factor.
     * @param factor the scale factor to apply
     */
    @Override
    public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}

