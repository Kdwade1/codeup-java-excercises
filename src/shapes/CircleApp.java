package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in= new Input();
        System.out.println("Create a circle.");
        Circle circle= new Circle(in.getDouble());
        System.out.println();

        circle.getCircumference();
        circle.getArea();
    }
}
