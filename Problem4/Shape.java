package Problem4;

/**
 * Abstract class representing a general Shape.
 * All shapes have a name, area, and perimeter.
 * Implements Scalable interface.
 */
public abstract class Shape implements Scalable {
    protected String name;

    /**
     * Constructor for Shape.
     * 
     * @param name Name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Abstract method to get the area of the shape.
     * 
     * @return area as double
     */
    public abstract double getArea();

    /**
     * Abstract method to get the perimeter of the shape.
     * 
     * @return perimeter as double
     */
    public abstract double getPerimeter();

    /**
     * Returns the string representation of the shape including its name,
     * area, and perimeter.
     */
    @Override
    public String toString() {
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", 
                             name, getArea(), getPerimeter());
    }
}

