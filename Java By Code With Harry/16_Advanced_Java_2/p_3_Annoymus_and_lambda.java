

interface phone
{
    void call();
    void message();
}



interface demo
{
    void call(String msg);
}


public class p_3_Annoymus_and_lambda {
    public static void main(String[] args) {

        // Annoymus class
        phone obj = new phone(){
            @Override
            public void call()
            {
                System.out.println("call...");
            }

            @Override
            public void message()
            {
                System.out.println("message...");
            }
        };



        obj.call();
        obj.message();

        // lambda expression 


        demo o = (msg)->{System.out.println(msg);};
        o.call("hello");


    }
}
