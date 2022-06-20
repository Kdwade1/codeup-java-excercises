package shapes;

public class ShapeTest {
    static Rectangle box1 = new Rectangle(4,5);
    static Rectangle box2 = new Square(5);


    public static void main(String[] args) {
        System.out.println("The area of box 1 is "+box1.getArea());
        System.out.println("The perimeter of box 1 is "+ box1.getPerimeter());
        System.out.println("The perimeter of box 2 is "+box2.getPerimeter());
        System.out.println("The area of box 2 is "+box2.getArea());

    }


}

