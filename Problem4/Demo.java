package Problem4;

/**
 * Demo class to test Shape scaling
 */
public class Demo {
    /**
     * Static method to scale an array of Scalable objects
     * 
     * @param arr array of Scalable objects
     * @param factor scaling factor
     */
    public static void scaleAll(Scalable[] arr, double factor) {
        for (Scalable s : arr) {
            s.scale(factor);
        }
    }

    /**
     * Main method to demonstrate scaling of shapes
     * @param args
     */
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle("My Circle", 5);
        shapes[1] = new Ellipse("My Ellipse", 6, 4);
        shapes[2] = new Triangle("My Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("My Equilateral Triangle", 6);
        shapes[4] = new Ellipse("Circle as Ellipse", 7, 7);

        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by factor 2
        Scalable[] scalableShapes = shapes; // Shape implements Scalable
        scaleAll(scalableShapes, 2.0);

        System.out.println("\nAfter scaling by factor 2:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

