public class Book {
    
    static void bookTitle(){
        System.out.println("Enter book name:");
    }
    
    static void canBorrowBook1(String book, String name){
        if (book.equals(name)) {
            System.out.println("Book has been successfully borrowed from library 1");
        } 
        else if(!book.equals(name)){
            System.out.println("Book is not available.");
        }
    }

    static void canBorrowBook2(String book, String name){
        if (book.equals(name)) {
            System.out.println("Book has been successfully borrowed from library 2");
        } 
    }
    
    static void canReturnBook(String book, String name){
        if(book.equals(name)){
            System.out.println("Book successfully returned.");
        }
    }

}
