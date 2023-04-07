
abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountain extends pen{
    @Override
    void write() {
        System.out.println("Write...");
    }
    @Override
    void refill()
    {
        System.out.println("Refill...");
    }
    void changeNib()
    {
        System.out.println("changeNib...");
    }
}


class Monkey{
    void jump(){
        System.out.println("jump...");
    }
    void bite()
    {
        System.out.println("bite");
    }
}


interface basicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements basicAnimal{
    public void eat()
    {
        System.out.println("eat...");
    }
    public void sleep()
    {
        System.out.println("sleep....");
    }
}

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class smartTelephone{
    void ring()
    {
        System.out.println("ring...");
    }
    void lift()
    {
        System.out.println("lift...");
    }
    void disconnect()
    {
        System.out.println("disconnect...");
    }
}


interface TvRemote{
    void buttons();
    void infared();
}

interface smartTvRemote extends TvRemote{
    void bluetooth();
    void smartKey();
}


class tv implements TvRemote, smartTvRemote{
    public void buttons(){
        System.out.println("buttons....");
    }
    public void infared()
    {
        System.out.println("infared...");
    }
    public void bluetooth()
    {
        System.out.println("bluetooth....");
    }
    public void smartKey()
    {
        System.out.println("smartKey....");
    }
}




class Exercise_5 {
    public static void main(String args[])
    {

        // Q1), Q2)
        fountain c = new fountain();
        c.write();
        c.refill();
        c.changeNib();

        System.out.println();

        // Q3)
        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();

        System.out.println();

        //Q4
        smartTelephone t = new smartTelephone();
        t.ring();
        t.lift();
        t.disconnect();

        System.out.println();
        

        // Q5)

        Monkey m = new Human();
        m.jump();
        m.bite();


        System.out.println();

        // Q6) Q7)
        tv remote = new tv();
        remote.buttons();
        remote.infared();
        remote.bluetooth();
        remote.smartKey();
        

    }
}
