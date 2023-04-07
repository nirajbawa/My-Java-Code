class employee{
    private int id = 45;
    private String name = "niraj";

    public employee()
    {
        this.id = 0;
        this.name = "-";
    }
    //constructor overloading
    public employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public int getid()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}

class p_2_constructors{
    public static void main(String args[])
    {
        // implicit call of constructor
        employee e = new employee();
        
        // employee e = new employee(20, "niraj");
        System.out.println(e.getid());
        System.out.println(e.getName());
    }
}