//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3, 0, 0);

        circle.setRadius(4);
        System.out.printf("Circle area: %.2f", circle.calculateArea());
        System.out.println();
        System.out.printf("Circle circumference: %.2f", circle.calculateCircumference());
        System.out.println();

        System.out.println("------------------------------");
        Rectangle rectangle = new Rectangle(5, 4, 0, 0);
        rectangle.setWidth(4);
        rectangle.setHeight(10);
        System.out.printf("Rectangle area: %.2f", rectangle.calculateArea());
        System.out.println();
        System.out.printf("Rectangle perimeter: %.2f", rectangle.calculateCircumference());
        System.out.println();

        System.out.println("------------------------------");
        Triangle triangle = new Triangle(5, 4, 0, 0);
        triangle.setBase(4);
        triangle.setHeight(10);
        System.out.printf("Triangle area: %.2f", triangle.calculateArea());
        System.out.println();
        System.out.printf("Triangle perimeter: %.2f", triangle.calculateCircumference());
        System.out.println();

    }
}