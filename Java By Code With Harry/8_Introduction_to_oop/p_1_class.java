class person{
    int id;
    String name;
    public void printD()
    {
        System.out.println("id = "+id+"\nname = "+name);
    }
}

class p_1_class {
    public static void main(String args[])
    {
        person p1 = new person();
        p1.id = 12;
        p1.name = "niraj";
    //    System.out.println("id = "+p1.id+"\nname = "+p1.name);
        p1.printD();
    }
}
