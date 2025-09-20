package ciiccb72025.chapter5.Task15;

public class Circle extends AbstractShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea()
    {
        return (Math.PI * this.radius * this.radius);
    }
    
    @Override
    public double calculatePerimeter()
    {
        return (2 * Math.PI * this.radius);
    }
    
}
