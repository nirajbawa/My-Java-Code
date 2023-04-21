package Shapesformule;

public class Rectangle{
    public int Length, Width, Height;
    public Rectangle(int Length, int Width, int Height)
    {
        this.Height = Height;
        this.Width = Width;
        this.Length = Length;
    }
    public int[] getRectangle()
    {
        int a[] = {this.Length, this.Width, this.Height};
        return a;
    }
    public int area()
    {
        return this.Length*this.Height;
    }
    public int volume()
    {
        return this.Length*this.Width*this.Height;
    }
}











