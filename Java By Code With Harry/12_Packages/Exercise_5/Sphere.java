package Shapesformule;


public class Sphere{
    public int radius;
    public Sphere(int radius)
    {
        this.radius = radius;
    }
    public int getSphere()
    {
        return this.radius;
    }
    public int area()
    {
        return (int)(4*Math.PI*Math.pow(radius, 2));
    }
    public int volume()
    {
        return (int)(4/3*(Math.PI*Math.pow(radius, 3)));
    }
}

