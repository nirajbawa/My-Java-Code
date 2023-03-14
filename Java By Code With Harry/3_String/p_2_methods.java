import java.util.jar.Attributes.Name;

public class p_2_methods {
    public static void main(String args[])
    {
        System.out.println("String methods : ");
        String Name = "niraj";
        // length
        int value = Name.length();
        System.out.println("length of Name : "+value);

        // changing case
        // lowercase
        String lcase = Name.toLowerCase();
        System.out.println("lowercase : "+lcase);

         // uppercase
         String ucase = Name.toUpperCase();
         System.out.println("lowercase : "+ucase);


        //  Trim

        String Sample = "      this is string    ";
        String Trimed = Sample.trim();
        System.out.println(Trimed);

        // substring

        String sStr = Name.substring(1);
        System.out.println(sStr);
         

        String ssStr = Name.substring(1, 4);
        System.out.println(ssStr);

        // replace 

        String Rstring = Name.replace("r", "i");
        System.out.println(Rstring);

        // StartWiths

        boolean StartWith = Name.startsWith("ni");
        System.out.println(StartWith);


         // endtWith
        boolean endtWith = Name.endsWith("aj");
        System.out.println(endtWith);

        // charAt
        char ChatAT = Name.charAt(1);
        System.out.println(ChatAT);

        // IndexOf

        int index1 = Name.indexOf("ra");
        System.out.println(index1);

        String Test = "nirajniraj";
        int index2 = Test.indexOf("niraj", 2);
        System.out.println(index2);

        // LastIndexOf

        int index3 = Test.lastIndexOf("raj");
        System.out.println(index3);

        // equals
        
        boolean eq = Name.equals("niraj");
        System.out.println(eq);

        // equals ignore Case

        boolean eqc = Name.equalsIgnoreCase("NIRAJ");
        System.out.println(eqc);

        // Escape Squence Characters 

        System.out.println("\t\"name\"\n");

    }
}
