package OOPs.staticKeyword;

class Mobile{
     int price;
     static String type;
     String brand;


    public Mobile(int price,String brand) {
        this.price = price;
        this.brand = brand;
        System.out.println("Constructor called");
    }


    static{
         type = "Phone";
        System.out.println("In static block");
     }

     public void print(){
         System.out.println(price + " " + type + " " +brand);
     }

     public static void printData(Mobile obj){
         System.out.println(obj.price + " " + type + " " +obj.brand);
     }
}
public class static_Key {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
        Mobile obj = new Mobile();
        obj.price = 10000;
        obj.brand = "Apple";
        obj.type = " Phone";

        Mobile obj1 = new Mobile();
        obj1.price = 100;
        obj1.brand = "Realme";
        obj1.type = "SmartPhone";

        obj.type = "SmartPhone";

        obj1.print();
        obj.print();

        System.out.println("Using the static method --> ");
        Mobile.printData(obj);

         */

        //Mobile obj = new Mobile(200,"Apple");

        Class.forName("OOPs.staticKeyword.Mobile");


    }
}
