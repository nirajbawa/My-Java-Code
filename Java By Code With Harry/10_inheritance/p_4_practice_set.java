class circle {
    public int radius;

    circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends circle {
    public int height;

    Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return Math.PI * height * height;
    }
}

class cuboid {
    public int length, breadth, height;
    public cuboid(int length,int breadth, int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    // object methods
    public String toString()
    {
        return "\nlength = "+length+"\nbreadth = "+breadth+"\nheight = "+height;
    }
}

class calCu extends cuboid{
    calCu(int length,int breadth, int height)
    {
        super(length, breadth, height);
    }

    public int Volume()
    {
        return length*breadth*height;
    }

    public int diagonal()
    {
        return (int) Math.sqrt((Math.pow(length, 2)+Math.pow(breadth, 2)+Math.pow(height, 2)));
    }

    public int sArea()
    {
        return 2*(length*breadth)+(breadth*height)+(height*length);
    }
}

class base
{
    base(){
        System.out.println("base");
    }
}

class derived1 extends base{
    derived1()
    {
        System.out.println("derived1");
    }
}

class derived2 extends derived1{
    derived2()
    {
        System.out.println("derived2");
    }
}

public class p_4_practice_set {
    public static void main(String args[]) {
        // Q1) Q3)
        Cylinder obj = new Cylinder(10, 20);
        System.out.println("area is : " + obj.area());
        System.out.println("volume is : " + obj.volume());


        System.out.println();

        //Q2) Q4)
        calCu cu = new calCu(10, 8, 4);
        System.out.println(cu); 

        System.out.println();

        System.out.println("Volume of cuboid is : "+cu.Volume()+" cubic units");
        System.out.println("Diagonal of cuboid is : "+cu.diagonal()+" units");
        System.out.println("Diagonal of cuboid is : "+cu.sArea()+" sq.units");
        System.out.println("\n\n");

        // Q5)
        derived2 d = new derived2();
    }
}
