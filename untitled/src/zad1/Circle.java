package zad1;

class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }


    public String getColor() {
        return color;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

}