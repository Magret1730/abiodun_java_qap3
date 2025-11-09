package Problem2;

public class Demo {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("Initial Position: (" + mp.getX() + ", " + mp.getY() + ")");
        System.out.println("Speed: (" + mp.getXSpeed() + ", " + mp.getYSpeed() + ")");

        mp.move();
        System.out.println("After Move Position: (" + mp.getX() + ", " + mp.getY() + ")");
    }
}
