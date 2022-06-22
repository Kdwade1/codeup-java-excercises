package shapes;

public class Square extends Quadrilateral {
    double sides;
    public Square(double sides) {
        super(sides,sides);
        this.length= sides;
        this.width= sides;
        this.sides=sides;
        
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
//double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.length = side;
//        this.width=side;
//        this.side= side;
//
//    }
    public double getPerimeter(){
        System.out.println("The perimeter of the square is: ");
        return 4* sides;
    }
    public double getArea(){
        System.out.println("The Area of the square is: ");
        return sides* sides;
    }
}

