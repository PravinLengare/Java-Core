package OOPs;
class Myths extends Thread{
    public Myths(String name ){
        super(name);
    }
    public void run(){
        int i = 0;

        while(true) {
            System.out.println("My thread" + this.getName());

        }
    }
}
public class Setting_Priority {
    public static void main(String[] args) {
        Myths t1 = new Myths("Pravin1");
        Myths t2 = new Myths("Pravin2");
        Myths t3 = new Myths("Pravin3");
        Myths t4 = new Myths("Pravin4");
        Myths t5 = new Myths("Pravin5(most important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

//        System.out.println("My thread name is "+t1.getName());
//        System.out.println("My thread name is "+t2.getName());
//        System.out.println("My thread name is "+t3.getName());
//        System.out.println("My thread name is "+t4.getName());
//        System.out.println("My thread name is "+t5.getName());




    }
}
