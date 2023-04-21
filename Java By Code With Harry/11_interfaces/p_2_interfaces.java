
// Interface in english is a point  where two system, mat and intract.

// In java interface is a group of related methods with empty bodies.


interface engine{
    int maxAspeed = 20;
    void startCar();
    void stopCar();
    int getMaxSpeed();
}

interface driver{
    int dId = 2013;
    void setName(String name);
    String getName(); 
    int getId();
}

class passenger{
    passenger()
    {
        System.out.println("Passenger Seating....");
    }
    
}

class car extends passenger implements engine, driver{
    String name;
    public void startCar()
    {
        System.out.println("car Starting...");
    }
    public void stopCar(){
        System.out.println("car Stoping...");
    } 
    public int getMaxSpeed()
    {
        return maxAspeed;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return dId;
    }

}


public class p_2_interfaces {
    public static void main(String agrs[])
    {
        car fortuner = new car();
        fortuner.setName("john");
        fortuner.startCar();
        fortuner.stopCar();
        System.out.println("Max Speed is : "+fortuner.getMaxSpeed());
        System.out.println("Driver Name : "+fortuner.getName());
        System.out.println("Driver id : "+fortuner.getId());
    }
}
