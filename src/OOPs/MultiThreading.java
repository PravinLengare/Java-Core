package OOPs;

class MyThreadRunnable1 implements Runnable{
    public void run () {
            int i = 0;
            while(i<3999){
        System.out.println("I am thread 1 not a threat 1");
        i++;
    }
    }
}
class MyThreadRunnable2 implements Runnable{

        public void run () {
            int i= 0;
            while(i<3000){
        System.out.println("I am thread 2 not a threat 2");
        i++;
    }
    }   
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1); // Link bullet1 to gun1

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2); // Link bullet2 to gun2

        gun1.start();
        gun2.start();
    }
}
