package Collection_Framework;

class MyGenerics<T1, T2> {

    int var;
    private T1 t1;
    private T2 t2;

    // Constructor
    public MyGenerics(int var, T1 t1, T2 t2) {
        this.var = var;
        this.t1 = t1;
        this.t2 = t2;
    }

    // Getter and Setter for var
    public void setVar(int var) {
        this.var = var;
    }

    public int getVar() {
        return var;
    }

    // Getter and Setter for t1
    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T1 getT1() {
        return t1;
    }

    // Getter and Setter for t2
    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }
}

public class Generics {
    public static void main(String[] args) {
        // Correct instantiation with two type parameters
        MyGenerics<String, Integer> g = new MyGenerics<>(23, "Pravin", 100);

        // Accessing the fields and methods
        String a = g.getT1();
        System.out.println("Value of t1: " + a);

        int b = g.getT2();
        System.out.println("Value of t2: " + b);

        int var = g.getVar();
        System.out.println("Value of var: " + var);
    }
}
