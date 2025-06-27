package ExceptionHandling;

import java.util.Scanner;

class MyException extends Exception{

    public String  toString(){

        return "I am in toString()";
    }
    public String getMessage(){

        return "I am in getMessage()";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the no :");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if(a < 9){

            try{
                //throw new MyException();
                throw new ArithmeticException("I am Pravin");
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");

            }
        }
        System.out.println("Yes finished!");

    }
}
