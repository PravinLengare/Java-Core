package Collection_Framework;
@FunctionalInterface

interface Carry{

    void demo(int a);
}
//
//class Amol implements Carry{
//
//    public void demo(){
//
//        System.out.println("I am Amol");
//    }
//
//}

//class Pravin implements Carry{
//
//    public void demo(){
//
//        System.out.println("I am Pravin");
//    }
//}
public class Anand_Lambada_Function {
    public static void main(String[] args) {
        // This  is traditional method to do

//        Carry c = new Pravin();
//        c.demo();

        // This is the way by creating the anonymous class if we have to use only one fun any at a instance or only at a time..

//        Carry c = new Carry() {
//            @Override
//            public void demo() {
//                System.out.println("I am Pravin");
//            }
//        };
//        c.demo();

        // Lambada Functions
//
//        Carry c = new Amol();
//        c.demo();

        // This is what we have to do in the lambda syntax

        Carry c = (a)->{System.out.println("I am Amol from Lambda function..."+a);  };

        c.demo(4);

    }
}


