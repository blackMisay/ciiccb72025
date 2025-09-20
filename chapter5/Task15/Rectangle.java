package ciiccb72025.chapter5.Task15;

public class Rectangle extends AbstractShape {

    public Rectangle(double length, double width) {
        super("", length, width);
    }

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    
    @Override
    public double calculateArea()
    {
        return (getLength() * getWidth());
    }
    
    @Override
    public double calculatePerimeter()
    {
        return (2 * (getLength() + getWidth()));
    }
    
}
