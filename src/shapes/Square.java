package shapes;

public class Square extends Rectangle {
double side;

    public Square(double side) {
        super(side, side);
        this.length = side;
        this.width=side;
        this.side= side;

    }
    public double getPerimeter(){
        return 4* side;
    }
    public double getArea(){
        return side* side;
    }
}

