package OOPs;
class C1{  // when we using in class only

    public int x = 6;
    protected int y = 5;
    int z = 4;
    private int a = 3;

    void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class C2 extends C1{
    void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        //System.out.println(a);
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        // C1 c = new C1();
        C2 c = new C2();
        c.meth1();
        c.meth2();
//        System.out.println(c.x);
//        System.out.println(c.y);
//        System.out.println(c.z);
//        System.out.println(c.a);      //when we using in same package then only private is not accessible

    }
}
