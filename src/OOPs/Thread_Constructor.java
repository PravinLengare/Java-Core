package OOPs;

class MyThr extends Thread{
    public MyThr(String name ){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<33){

            System.out.println("My thread");
            i++;
        }
    }
}
public class Thread_Constructor {
    public static void main(String[] args) {
    MyThr m = new MyThr("Pravin");
    MyThr m1 =  new MyThr("Amol");
    m.start();
    m1.start();
        System.out.println("My thread name is "+m.getName());
        System.out.println("My thread name is "+m1.getName());

        System.out.println("The id of thread is "+m.getId());
        System.out.println("The id of thread is "+m1.getId());

    }
}
