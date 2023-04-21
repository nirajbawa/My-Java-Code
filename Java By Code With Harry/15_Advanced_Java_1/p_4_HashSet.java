import java.util.HashSet;

public class p_4_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> li = new HashSet<>(5, 0.5f);
        
        li.add(10);
        li.add(20);
        li.add(30);


        System.out.println(li.contains(20));
        System.out.println(li.isEmpty());
        System.out.println();

        for (Integer integer : li) {
            System.out.println(integer);
        }
    }
}
