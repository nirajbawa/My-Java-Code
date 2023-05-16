import java.util.Scanner;

class Emp
{
    public int empId;
    public String name;

    public Emp(int empId, String name)
    {
        empId = this.empId;
        name = this.name;
    }

    public String getEmp()
    {
        return "\n\nDetails : \n Id : "+this.empId+"\n Name : "+this.name+"\n\n";
    }
}

public class p_3_Array_Of_Objects {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Emp emps[] = new Emp[20];

        for(int i = 0; i<emps.length; i++)
        {
            System.out.println("\nEnter Name : ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("\nEnter Id : ");
            int Id = sc.nextInt();
            emps[i] = new Emp(Id, name);
            System.out.println(emps[i].getEmp());
            
        }

        
    }
}
