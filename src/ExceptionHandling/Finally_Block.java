package ExceptionHandling;

public class Finally_Block {
//    public static void greet(){
//        try{
//            int a = 4;
//            int b = 0;
//            int c = a/b;
//        }
//        catch (Exception e ){
//            System.out.println(e);
//        }
//    }
    public static int divide(){
        try{
            int a = 4;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch (Exception e ){
            System.out.println("The exception is occur");
            System.out.println(e);
        }
        finally {
            System.out.println("I am Pravin Sanjay Lengare");
        }
        return 0;

    }
    public static void main(String[] args) {
        int k = divide();                   // before returning the value the finally block gets executed
        System.out.println(k);

        int a = 10;
        int b = 3;

        // for good practise only

        while (true){
            try {
                int c = a/b;
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally !"+b);    // here stops code because the ari ex occur
                b--;
            }
        }
        try {
            System.out.println(a/b);
        }
        finally {
            System.out.println("I am Pravin");
        }
    }
}
// we can write try with finally block but only try can not run