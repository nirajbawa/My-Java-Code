
import java.util.Vector;


public class p_5_Vector_by_me {
    public static void main(String args[])
    {
        // vector is a class in java that impliment the dynamic array. this class stores any number of object of any data type.
        // this class is defined in java.util package

        

        
        Vector obj = new Vector();

        obj.add(10);
        obj.add("niraj");
        obj.addElement('2');
        System.out.println(obj.elementAt(2));
        System.out.println(obj);
        obj.insertElementAt(10.5, 2);
        System.out.println(obj);
        obj.removeElement("niraj");
        System.out.println(obj);
        obj.removeElementAt(2);
        System.out.println(obj);
        // obj.removeAllElements();
        System.out.println(obj);
        System.out.println("capacity : "+obj.capacity());
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        System.out.println(obj.firstElement());

        System.out.println(obj.indexOf(10));
        System.out.println();
        obj.setSize(20);
      


        System.out.println(obj);
        



    }
}
