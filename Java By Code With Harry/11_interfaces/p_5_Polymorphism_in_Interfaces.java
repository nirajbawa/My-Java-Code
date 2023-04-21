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


class p_5_Polymorphism_in_Interfaces {
    public static void main(String args[])
    {
        Mycamera cam = new smartPhone();
        cam.takeSnap();
        cam.record4KVideo();
        MyWifi w = new smartPhone();
        w.getNetworks();
        w.connectToNetwork("niraj");
        
    }
}
