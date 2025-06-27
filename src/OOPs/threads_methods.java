package OOPs;

class Myths1 extends Thread{
    public Myths1(String name ){
        super(name);
    }
    public void run(){
        int i = 0;

        while(true) {
            System.out.println("My thread" + this.getName());
            try {
                Thread.sleep(334);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;

        }
    }
}
class Myths2 extends Thread{
    public Myths2(String name ){
        super(name);
    }
    public void run(){
        int i = 0;

        while(i<333) {
            System.out.println("My thread of another class " + this.getName());
            i++;

        }
    }
}

public class threads_methods {
    public static void main(String[] args) {
        Myths1 t1 = new Myths1("Pravin");
        Myths2 t2  = new Myths2("Amol");

        t1.start();// If I have to run t1 and after execution of t1 then I have to run t2 then I will use join method
//        try {
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();

    }

}
