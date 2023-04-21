import java.util.*;

public class p_1_ArrayList {
    public static void main(String args[])
    {
        
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>(5);
        
        li2.add(310);
        li2.add(320);
        li2.add(330);

        li.add(10);
        li.add(20);
        li.add(30);

        li.add(0, 100);
        li.add(1, 200);

        li.addAll(0,li2);


        System.out.println("\n"+li.contains(10));
        System.out.println(li.indexOf(10));
        System.out.println(li.lastIndexOf(320));
        System.out.println(li.isEmpty());

        li.set(1, 566);

       
        // li.clear();


        System.out.println();
        for(int i=0; i<li.size(); i++)
        {
            System.out.println(li.get(i));
        }
        System.out.println();
        
        for (Integer integer : li2) {
            System.out.println(integer);
        }
    }
}
