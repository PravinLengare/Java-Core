package OOPs;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class Fountainpen extends Pen{
    void write(){
        System.out.println("I am writing ");
    }
    void refill(){
        System.out.println("I am refilling the pen");
    }
    void changeNib(){
        System.out.println("I am changing the nib");
    }
}
class Monkey{

    void jump(){
        System.out.println("He is jumping");
    }
    void bite(){
        System.out.println("He is biting");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("The animal is eating");
    }
    public void sleep(){
        System.out.println("The animal is sleeping");
    }
}

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{

    void ring(){

        System.out.println("The telephone is ringing");
    }
    void lift(){

        System.out.println("The telephone is lifting by me ");
    }

    void disconnect(){

        System.out.println("The telephone is disconnected by them");
    }
    public void call(){
        System.out.println("jksffksj");
    }
}

interface TvRemote{
    void takeremote();
    void ontv();
}


interface SmartTvremote extends TvRemote{
    void takeremotesmarttv();
    void ontvsmarttv();
}

class Tv implements SmartTvremote{

    public void takeremote(){

        System.out.println("Taking remote");
    }
    public void ontv(){

        System.out.println("Doing on tv by remote");
    }
    public void takeremotesmarttv(){

        System.out.println("Taking remote of smart tv");
    }
    public  void ontvsmarttv(){

        System.out.println("Doing on smart tv by remote");

    }

}
public class Practiseset11 {
    public static void main(String[] args) {
//        Fountainpen pen = new Fountainpen();
//        pen.changeNib();
//        pen.refill();
//        pen.write();
//        Pen p = new Fountainpen();
//        p.refill();
//        p.write();
        // p.changeNib(); cant access this because the reference of pen and we are trying to access method of Fountainclass

        //ques 02
//
//        Human h = new Human();
//
//        h.jump();
//        h.bite();
//        h.eat();
//        h.sleep();


        // que03
//
//        Telephone t = new SmartTelephone();  // By using polymorphism
//
//        t.ring();
//        t.lift();
//        t.disconnect();
//        //t.call(); only methods in Telephone defined will be accessible because the reference of Parent class
//
//        // que05
//
//        Monkey m = new Human(); // By using polymorphism
//        m.bite();
//        m.jump();
//        // m.eat();

//        BasicAnimal b = new Human();
//        b.eat();
//        b.sleep();
//         //b.bite();


        Tv t = new Tv();
        t.takeremote();
        t.ontv();
        t.takeremotesmarttv();
        t.ontvsmarttv();
    }
}
