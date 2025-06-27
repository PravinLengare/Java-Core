package OOPs;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int n;
    public int noOfGuesses = 0;
    public int inputNumber;

    Game(){
        Random r = new Random();
        this.n = r.nextInt(100);
    }
    void takeInput(){
        System.out.println("Enter the input from user to guess the number :");
        Scanner s = new Scanner(System.in);
        inputNumber = s.nextInt();
    }
    boolean isCorrectedNumber(){
        noOfGuesses++;

        if(inputNumber==n ){
            System.out.printf("Yes, you got that and the number is %d\tand you guessed in %d attempts \n" ,inputNumber,noOfGuesses);
            return true;
        }
        else if(inputNumber < n){
            System.out.println("Too less from target");
        }
        else if(inputNumber > n){
            System.out.println("Too far from target");
        }

        return false;
    }
//    void setNoOfGuess(int noOfGuesses){
//
//        this.noOfGuesses = noOfGuesses;
//    }
//    int getNoOfGuesses(){
//
//        return noOfGuesses;
//    }

}
public class Exersice03 {
    public static void main(String[] args) {
    Game g = new Game();
    boolean b = false;
    while (!b) {
        g.takeInput();
//        g.setNoOfGuess(4);
//        System.out.println(g.getNoOfGuesses());
        b = g.isCorrectedNumber();
        System.out.println(b);
    }

    }
}
