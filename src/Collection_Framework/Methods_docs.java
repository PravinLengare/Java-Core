package Collection_Framework;

/**
 * This is a good class
 */
public class Methods_docs {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {

    }

    /**
     * Hello this is method and we are trying to learn the concept of java docs how it is working in deeply
     * @param i This is first no to add
     * @param j This is second no to add
     * @return It will return the c para
     * @throws Exception if the no i is zero
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i,int j) throws Exception{

        if(i==0){
             throw new  Exception();
        }

        int c;
        c =  i+j;
        return c;
    }
}
