package ExceptionHandling;

public class UseOfTryCatchBlock {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        // Without try catch block
//        int c = a/b;
//        System.out.println("The addition is "+c);
        // With try catch block

        int c;
        try {
            c = a/b;
            System.out.println("The addition is "+c);
        }
        catch (Exception e){
            System.out.println("We failed to run.");
            System.out.println(e);
        }

        System.out.println("End of program!");
    }
}
