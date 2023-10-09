public class p_4_string_buffer {
    public static void main(String args[])
    {
        // String buffer is a class which is alternative to the string class. but string
        //  buffer class is more flaxable to use than the string class.


        StringBuffer str = new StringBuffer("java");
        System.out.println(str.length());
        str.append(" basics");
        System.out.println(str);
        System.out.println(str.capacity());
        System.out.println(str.charAt(5));
        System.out.println(str.insert(2, 100));
        System.out.println(str.delete(0, 2));
        System.out.println(str.length());
        str.setCharAt(0, 'v');
        str.setLength(5);
        String s = str.toString();
        System.out.println(s);
        str.replace(0, 2, "niraj");
        System.out.println(str);
        System.out.println(str.reverse());

    }
}
