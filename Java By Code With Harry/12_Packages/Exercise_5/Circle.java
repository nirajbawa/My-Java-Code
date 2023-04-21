package Shapesformule;

public class Circle{
    public int radius;
    public Circle(int radius)
    {
        this.radius = radius;
    }
    public int getCircle()
    {
        return this.radius;
    }
    public int area()
    {
        return (int)(Math.PI*Math.pow(radius, 2));
    }
}