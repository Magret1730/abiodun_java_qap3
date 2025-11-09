package Problem2;

/**
 * MovablePoint class extending Point class.
 * It includes attributes for xSpeed and ySpeed,
 * and methods to move the point.
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 2024-9-9
 */
public class MovablePoint extends Point {
    // Attributes for speed in x and y directions
    private float xSpeed;
    private float ySpeed;

    /**
     * Constructor for the MovablePoint class.
     * Initializes the point with x and y coordinates,
     * @param x
     * @param y
     * @param xSpeed
     * @param ySpeed
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Default constructor for the MovablePoint class.
     */
    public MovablePoint() {
        // super();
    }

    /**
     * Getter for xSpeed
     * @return xSpeed
     */
    public float getXSpeed() {
        return xSpeed;
    }

    /**
     * Setter for xSpeed
     * @param xSpeed
     */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * Getter for ySpeed
     * @return ySpeed
     */
    public float getYSpeed() {
        return ySpeed;
    }

    /**
     * Setter for ySpeed
     * @param ySpeed
     */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Getter for both xSpeed and ySpeed
     * @return array containing xSpeed and ySpeed
     */
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    /**
     * Setter for both xSpeed and ySpeed
     * @param xSpeed
     * @param ySpeed
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Overriding toString method to provide string representation of MovablePoint
     * @return string representation of MovablePoint
     */
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    /**
     * Method to move the point by its speed
     */
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);

        return this;
    }
    
}
