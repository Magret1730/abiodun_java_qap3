package Problem4;

/**
 * Class representing a Circle.
 * Circle is a special case of Ellipse where a = b = radius
 */
public class Circle extends Ellipse {

    /**
     * Constructor for Circle
     * 
     * @param name Name of the circle
     * @param radius radius of the circle
     */
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    /**
     * Scales the circle by the given factor.
     * @param factor the scale factor to apply
     */
    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}

