package Shapesformule;


public class Cylinder{
    public int Height, radius;
    public Cylinder(int Height, int radius)
    {
        this.Height = Height;
        this.radius = radius;
    }
    public int[] getCylinder()
    {
        int a[] = {this.Height, this.radius};
        return a;
    }
    public int area()
    {
        return (int)(2*Math.PI*radius*(Height+radius));
    }
    public int volume()
    {
        return (int)(Math.PI*2*Height);
    }
}