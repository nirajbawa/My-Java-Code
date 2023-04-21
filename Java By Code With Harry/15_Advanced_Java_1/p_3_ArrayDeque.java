import java.util.ArrayDeque;

public class p_3_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> li = new ArrayDeque<>();
        li.add(6);
        li.add(56);
        li.add(9);
        li.addFirst(50);

        System.out.println();

       
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
        System.out.println(li.contains(9));

        System.out.println();
      
        for (Integer integer : li) {
            System.out.println(integer);
        }
    }
}
