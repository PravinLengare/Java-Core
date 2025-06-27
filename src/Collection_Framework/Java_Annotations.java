package Collection_Framework;

@FunctionalInterface
interface MyclassInterface{

    void voice();
    //void mVoice();
}
class Myphone {

    public void makeVoice(){
        System.out.println("I am  making voice of Myphone");
    }

}
class Phone extends Myphone{
    @Override
    public void makeVoice(){
        System.out.println("I am  making voice of Phone");
    }
    @Deprecated
    public int sum(int i ,int j){

        return i + j;
    }
}
public class Java_Annotations {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")  // it means put down the voice of compiler for giving the instruction to the compiler
        Phone phone = new Phone();
        phone.makeVoice();
        phone.sum(3,4);

    }
}
