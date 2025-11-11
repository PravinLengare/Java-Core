package String;

public class basic {
    public static void main(String[] args) {

        String n = "pravin";
        String k = "pravin";
        System.out.println(n == k);

        n = n + " lengare";  // only reference will change not the data itself
        System.out.println(n);


        //  String Buffer

        StringBuffer sb = new StringBuffer("Pravin");
        sb.append(" Lengare");
        System.out.println(sb);
        sb.insert(4,"A");
        System.out.println(sb);



    }
}
