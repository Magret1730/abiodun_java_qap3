package Problem2;

/**
 * Point class representing a point in 2D space.
 * It includes attributes for x and y coordinates,
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 2024-9-9
 */
public class Point {
    private float x;
    private float y;

    /**
     * Constructor for the Point class.
     * Initializes the point with x and y coordinates.
     * @param x
     * @param y
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Default constructor for the Point class.
     */
    public Point() {}

    /**
     * Getter for x coordinate
     * @return x coordinate
     */
    public float getX() {
        return x;
    }

    /**
     * Setter for x coordinate
     * @param x x coordinate
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Getter for y coordinate
     * @return y coordinate
     */
    public float getY() {
        return y;
    }

    /**
     * Setter for y coordinate
     * @param y y coordinate
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Getter for both x and y coordinates
     * @return array containing x and y coordinates
     */
    public float[] getXY() {
        return new float[]{x, y};
    }

    /**
     * Setter for both x and y coordinates
     * @param x x coordinate
     * @param y y coordinate
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * toString method to represent the Point object as a string
     * @return string representation of the Point object
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
