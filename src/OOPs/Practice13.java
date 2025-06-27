package OOPs;
class Practice_Thread extends Thread{
    public void run(){

        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class Practice_Thread1 extends Thread{
//    public void run(){
//
//        while(true){
//
//            System.out.println("Welcome!");
//
//            try{
//                Thread.sleep(200);
//            }
//            catch(InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//
//    }
}
public class Practice13 {

    public static void main(String[] args) {
    Practice_Thread p = new Practice_Thread();
    Practice_Thread1 p1 = new Practice_Thread1();
    p.setPriority(3);  // If we don't set the priority then that is normal
    p1.setPriority(2);

    System.out.println(p.getPriority());
    System.out.println(p1.getPriority());
    System.out.println(p.getState());
    System.out.println(p1.getState());
//    p.start();
    p1.start();
    System.out.println(p1.getState());
    System.out.println(Thread.currentThread().getState());  // to get the state of the current working thread

    }
}
