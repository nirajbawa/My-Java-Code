package Shapesformule;

public class Square{
    public int side1, side2, d3 ;
    public Square(int side1, int side2, int d3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.d3 = d3;
    }
    public int[] getSquare()
    {
        int a[] = {this.side1, this.side2, this.d3};
        return a;
    }
    public int area()
    {
        return this.side1*this.side2;
    }
    public int volume()
    {
        return (int)(Math.sqrt(3)*this.d3)/9;
    }
}