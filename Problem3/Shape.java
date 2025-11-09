package Problem3;

/**
 * Abstract class representing a geometric shape.
 * This class defines the common properties and methods for all shapes.
 *
 * Author: Abiodun Magret Oyedele
 * Date: 9/11/2025
 */
public abstract class Shape {
    protected String name;

    /**
     * Constructor to initialize the shape with a name.
     *
     * @param name The name of the shape.
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Abstract method to compute the area of the shape.
     *
     * @return The area of the shape.
     */
    public abstract double getArea();

    /**
     * Abstract method to compute the perimeter of the shape.
     *
     * @return The perimeter of the shape.
     */
    public abstract double getPerimeter();

    /**
     * Returns a string representation of the shape, including its name, area, and perimeter.
     *
     * @return A string representation of the shape.
     */
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}


// Problem#3:

// Abstract Classes

// Consider the following shapes; Ellipse, Circle, Triangle, EquilateralTriangle. Each shape should have a name, a method to compute its perimeter, and another method to compute its area. The name should be an instance variable of type String. Design your inheritance hierarchy with the common features in the Abstract superclass Shape. Notice that the area and perimeter are common to all Shapes, but we don’t know how to compute the area or perimeter for a general shape.

// The ellipse class has a major and minor axes a and b, respectively. The constructor should assign the largest value to a and smallest to b. The area and perimeters of an ellipse are:

// Perimeter = P = π 2(a2 + b2) - (a - b)2/2 [Note that if a = b = r, then P = 2πr]

// Area = A = πab

// The Triangle class has three instance variables side1, side2, and side3. The formula for the area and perimeter of a general Triangle with sides A, B, and C is given by.




// The condition for any three positive values to make sides of a Triangle is:

// side1+side2>side3 and side2+side3>side1 and side3+side1>side2

// You need to check this condition inside the constructor. If it is not satisfied, print an error message and terminate the program, otherwise make your Triangle object.

// The three sides of the equilateral triangle are equal.

// Make a Test class where you make objects from the different classes and store them in an array of type Shape. Then, make a loop and print the objects name, area, and perimeter through toString i.e. you need to override toString in the Shape class only.

// Deliverables:

// Complete and working-class files with proper comments.

// 1. Shape.java

// 2. Circle.java

// 3. Ellipse.java

// 4. Triangle.java

// 5. EquilateralTriangle.java

// 6. Demo.java

// 7. Screenshot of the running code’s output
