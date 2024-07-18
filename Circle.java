public class Circle extends Shape{
    private double radius;

    public Circle(double radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.141592653589793 * radius * radius;
    }

    @Override
    public double calculateCircumference() {
        return 2 * 3.141592653589793 * radius;
    }
}
