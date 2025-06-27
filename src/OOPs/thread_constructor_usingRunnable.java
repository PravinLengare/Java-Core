package OOPs;
class Mt implements Runnable{

    public void run(){

        int i = 0;
        while(i<3){

            System.out.println("I am thread 1 not a threat 1");
            i++;
        }
    }
}
public class thread_constructor_usingRunnable {
    public static void main(String[] args) {
    Runnable m = new Mt();  // Creating runnable object

        // First constuctor in runnable
//    Thread t = new Thread(m,"Pravin");
// passing the two arguments runnable and name

        // Second constuctor in runnable
        Thread t = new Thread(m);
        t.start();  // Start the thread
        System.out.println("The name of the thread is "+t.getName());
        System.out.println("The id is "+t.getId());
    }
}
