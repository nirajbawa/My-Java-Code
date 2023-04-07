

class cellPhone{
    void callNumber(int phoneNo)
    {
        System.out.println("calling "+phoneNo);
    }
    void pickCall()
    {
        System.out.println("Connecting...");
    }
}

interface Mycamera{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("good morning");
    }
    default void record4KVideo()
    {
        greet();
        System.out.println("recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}




class smartPhone extends cellPhone implements Mycamera, MyWifi{
    smartPhone()
    {
        System.out.println("smart phone starting...");
    }
    public void takeSnap()
    {
        System.out.println("Taking snap");
    }
    public void recordVideo()
    {
        System.out.println("Taking video");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting list of networks");
        String[] networkList = {"niraj", "bava", "co"};
        return networkList;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("Connecting to "+network);
    }
    public void record4KVideo()
    {
        System.out.println("smartphone recording in 4k");
    }
}


class p_3_Java_nterfaces_Example_Default_Methods {
    
    public static void main(String agrs[])
    {
        smartPhone s1 = new smartPhone();
        s1.takeSnap();
        s1.recordVideo();
        s1.getNetworks();
        s1.connectToNetwork("niraj");
        s1.callNumber(685454468);
        s1.pickCall();
        s1.record4KVideo();

    }
}
