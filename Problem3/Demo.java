package Problem3;

/**
 * Demo class to test the Shape hierarchy.
 * 
 * Author: Abiodun Magret Oyedele
 * Date: 9/11/2025
 */
public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle("My Circle", 5);
        shapes[1] = new Ellipse("My Ellipse", 6, 4);
        shapes[2] = new Triangle("My Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("My Equilateral Triangle", 6);
        shapes[4] = new Ellipse("Circle as Ellipse", 7, 7);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
