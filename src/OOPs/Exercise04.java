package OOPs;

class Library{
    String[] Books;
    int noofBooks;
    Library(){

        this.Books = new String[100];
        this.noofBooks = 0;
    }
    void addBook(String book){

        this.Books[noofBooks] = book;
        System.out.println(book+" has been added to Library");
        noofBooks++;

    }
    void issueBook(String book){

        for (int i=0;i<this.Books.length;i++){
            if(this.Books[i].equals(book)){
                System.out.println("This book has been issued");
                this.Books[i]=null;
                return;
            }
            System.out.println("*"+book);
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){

        addBook(book);
    }
    void showAvailableBooks(){

        System.out.println("Available Books are :");
        for(String book: this.Books){
            if(book==null){
                continue;
            }
            System.out.println("->"+book);
        }
//        System.out.println(noofBooks);
    }

}
public class Exercise04 {
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook("Think and grow Rich");
        l.addBook("OOPs");
        l.showAvailableBooks();
        l.issueBook("OOPs");
        l.returnBook("OOPs");
    }
}
