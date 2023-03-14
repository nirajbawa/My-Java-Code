
class employee{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setsalary(int s)
    {
        salary = s;
    }
}

class Ringing{
    public void Ringing()
    {
        System.out.println("Ringing....");
    }
    public void vibrating()
    {
        System.out.println("vibrating....");
    }
}

class square{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}


class Tommy{
    public void hit()
    {
        System.out.println("Hitting the enemey");
    }
    public void run()
    {
        System.out.println("running");
    }
    public void fire()
    {
        System.out.println("firing");
    }
}

public class p_2_practice_set {
    public static void main(String args[])   
    {
        
        System.out.println();
        employee e1 = new employee();

        e1.setName("niraj");
        System.out.println("Name = "+e1.getName());

        e1.setsalary(20000);
        System.out.println("Salary = "+e1.getSalary());

        
        System.out.println();
        Ringing obj = new Ringing();
        obj.Ringing();
        obj.vibrating();

        System.out.println();

        square sq = new square();
        sq.side = 20;
        System.out.println("area = "+sq.area());
        System.out.println("perimeter = "+sq.perimeter());

        System.out.println();

        Tommy player1 = new Tommy();
        player1.hit();
        player1.run();
        player1.fire();
    }
}
