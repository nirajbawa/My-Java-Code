/**
 * This class is sample discription
 * This is <i>Short<i/> sample
 * @author niraj bava
 * @version 0.1
 * @since 2002
 * @see <a href="https://google.com/" target="_blank_">google</a>
 */

public class p_1_classDocsTag {
    /**
     *
     * @param args These area argument suplid to command line
     */
    public static void main(String[] args) {
        System.out.println("hello");
    }

    /**
     * this is add method
     * @param a input a
     * @param b input b
     * @return return integer
     * @throws Exception if a==b
     * @deprecated this method is deprecated
     */

    public static int add(int a, int b) throws Exception {
        if (a == b) {
            throw new Exception();
        }
        return a + b;
    }
}
