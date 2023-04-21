import java.util.LinkedList;

public class p_2_LinkedList {
    public static void main(String args[])
    {
        LinkedList<Integer> li = new LinkedList<>();

        li.add(10);
        li.add(20);
        li.add(30);

        li.add(1, 40);
        li.set(2, 500);

        System.out.println(li.isEmpty());
        System.out.println(li.contains(30));
        System.out.println(li.indexOf(30));
        System.out.println(li.lastIndexOf(30));


        System.out.println();

        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

    }
}
