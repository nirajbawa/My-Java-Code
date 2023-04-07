
class MyEmployee{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public int getid()
    {
        return id;
    }
    public void SetName(String n)
    {
        name = n;
    }

    public void SetId(int i)
    {
        id = i;
    }
}

class p_1_Access_modifiers{
    public static void main(String args [])
    {
        MyEmployee e1 = new MyEmployee();

        e1.SetId(1);
        e1.SetName("niraj");

        System.out.println("the id is : "+e1.getid());
        System.out.println("the name is : "+e1.getName());

    }
}

