import Shapesformule.Circle;
import Shapesformule.Square;
import Shapesformule.Sphere;
import Shapesformule.Cylinder;
import Shapesformule.Rectangle;

public class Calculator{
    public static void main(String args[])
    {
        // find area and volume of rectangle, square, circle, cylinder, sphere
        
        /*
        
            area of rectangle : Length × Width
            volume of rectangle : Length x Width x Height
    
            area of square : side  × side
            volume of square : (√3 × d3)/9

            area of circle : πr2
            
            area of cylinder : 2πr (h + r)
            volume of cylinder : πr2h

            area of sphere : 4πr²
            volume of sphere : 4/3 πr3

         */


        Circle cir = new Circle(30);
        System.out.println(cir.getCircle());
        System.out.println(cir.area());
        
        Square squ = new Square(20, 30, 40);
        System.out.println();
        int squA[] = squ.getSquare();
        for(int i:squA)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(squ.area());
        System.out.println(squ.volume());


        Sphere sph = new Sphere(50);
        System.out.println(sph.getSphere());
        System.out.println(sph.area());
        System.out.println(sph.volume());


        Cylinder cyli = new Cylinder(30, 40);
        System.out.println();
        int cyliA[] = cyli.getCylinder();
        for(int i:cyliA)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(cyli.area());
        System.out.println(cyli.volume());

        Rectangle rec = new Rectangle(20, 50 ,100);
        System.out.println();
        int recA[] = rec.getRectangle();
        for(int i:recA)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(rec.area());
        System.out.println(rec.volume());
    }
}