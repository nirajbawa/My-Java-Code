class Cylinder{
    private float radius;
    private int height;

    public Cylinder(float r, int h)
    {   
        radius = r;
        height = h;
    }

    public void setRad(float r)
    {
        radius= r;
    }

    public void setHei(int h)
    {
        height = h;
    }

    public float getRad()
    {
        return radius;
    }

    public int getheight()
    {
        return height;
    }
    public double surfaceArea()
    {
        return 2*3.142*radius*radius+2*3.142*radius*radius*height;
    }
    public double volume()
    {
        return 3.142*radius*radius*height;
    }
}

class rectange{
    private int length;
    private int breadth;

    public rectange()
    {
        this.length = 4;
        this.breadth = 5;
    }

    
    public rectange(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getlength(){
        return length;
    }

    public int getbreadth(){
        return length;
    }

}


class sphere{
    private float radius;

    public sphere(float r)
    {   
        radius = r;
    }

    public float getRad()
    {
        return radius;
    }

    public double surfaceArea()
    {
        return 4*3.142*radius*radius;
    }
}


public class p_3_practice_set {
    public static void main(String args[])
    {
        // Q1), Q2), Q3)
        Cylinder s = new Cylinder(20.0f, 30);

        // s.setRad(20.0f);
        // s.setHei(30);
        System.out.println("radius : "+s.getRad());        
        System.out.println("height : "+s.getheight());
        System.out.println("Surface Area : "+s.surfaceArea());
        System.out.println("Volume : "+s.volume());

        // Q4)

        rectange r = new rectange();
        System.out.println("length : "+r.getbreadth());
        System.out.println("breadth : "+ r.getlength());

        rectange rs = new rectange(20, 30);
        System.out.println("length : "+rs.getbreadth());
        System.out.println("breadth : "+ rs.getlength());

        // Q5)
        sphere sph = new sphere(20.4f);

        System.out.println("radius : "+sph.getRad());        
 
        System.out.println("Surface Area : "+sph.surfaceArea());
        

    }
}
