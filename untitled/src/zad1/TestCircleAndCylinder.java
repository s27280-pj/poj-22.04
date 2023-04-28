package zad1;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("zad1.Circle with radius " + circle.getRadius() + " and color " + circle.getColor());
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, "red", 10.0);
        System.out.println("zad1.Cylinder with radius " + cylinder.getRadius() + ", color " + cylinder.getColor() + ", and height " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
