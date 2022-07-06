package shapes;

public class ShapesTest {



    public static void main(String[] args) {
//        System.out.println("The area of box 1 is "+box1.getArea());
//        System.out.println("The perimeter of box 1 is "+ box1.getPerimeter());
//        System.out.println("The perimeter of box 2 is "+box2.getPerimeter());
//        System.out.println("The area of box 2 is "+box2.getArea());
        Measurable myShape = new Rectangle(3,7);
        Measurable myShapes = new Square(5);
        System.out.println(myShapes.getArea());
        System.out.println(myShapes.getPerimeter());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

    }

    }




