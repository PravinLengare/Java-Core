package OOPs;
class Parent{

    public int a = 3;
    void show(){
        System.out.println("the default value from Parent class is " + a);
    }
}
public class test {
    public static void main(String[] args) {
        Parent  p = new Parent();
        p.show();
    }
}
