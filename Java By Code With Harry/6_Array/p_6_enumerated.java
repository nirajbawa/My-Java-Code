public class p_6_enumerated {
    enum fruit{
        mango,
        apple,
        orange, 
        bannana
       } 
   public static void main(String[] args) {
    for(fruit i:fruit.values())  
    System.out.println(i);
    }
}
