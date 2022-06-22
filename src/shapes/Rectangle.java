package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    public Rectangle(double length, double width) {
        super(length, width);
    }
//  protected   double length;
//  protected  double width;

//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//
//
    public double getPerimeter(){
        System.out.println("The perimeter of this Rectangle is...");
        return (length+width)*2;
    }
   public double getArea(){
       System.out.println("The Area of this Rectangle is...");
        return  (length*width);
    }
//
//


}
