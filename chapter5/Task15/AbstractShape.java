package ciiccb72025.chapter5.Task15;

public class AbstractShape implements Shape {
    
    private String color;
    private double length;
    private double width;

    public AbstractShape() {

    }
    
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double calculateArea()
    {
        return 0;
    }
    
    public double calculatePerimeter()
    {
        return 0;
    }

    public String getColor() {
        return this.color;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}
