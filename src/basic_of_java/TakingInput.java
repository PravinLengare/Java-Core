package basic_of_java;
// In this code we have learnt the use of  static keyword very  well ...
import java.util.Scanner;
class Taje{
    static int d1 = 1;
    public static int add1(int a1 ,int b1){

        return a1 + b1;
    }
}
public class TakingInput {
    static int d = 1;
    public  static int add(int a ,int b){

        return a + b;
    }
    public  static void main(String[] args) {

//        Taje t = new Taje();
//        System.out.println(t.add1(3,4));



        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = s.nextInt();

        System.out.println("Enter the character:");
        char c = s.next().charAt(0);
        s.nextLine();

        System.out.println("Enter the char:");
        String name = s.next();
        s.nextLine();// It only take the  first letter
//
        System.out.println("Enter the name1:");
        String name1 = s.nextLine(); // It takes the whole line
        System.out.println("The number is "+a);
        System.out.println("The string is "+name);
        System.out.println("The name is "+name1);
        System.out.println("The char is "+c);

        s.close();

         // by  creating the object of class


        TakingInput t  = new TakingInput();
        System.out.println("I am accessing this  without using the static method in main function" +t.d);
        System.out.println(t.add(2,3));

        // by  not creating the  object of  class and made the method static

        System.out.println(TakingInput.add(4,5));
        System.out.println(TakingInput.d);


      System.out.println(Taje.add1(3,3));
        System.out.println(Taje.d1);



        

    }
}
