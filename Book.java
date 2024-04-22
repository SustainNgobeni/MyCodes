public class Book {
    
    //method that prompts user to enter book name 
    public static void bookTitle(){
        System.out.println("Enter book name:");
    }
    
    //method to check if book is available
    public static boolean isBookAvailable(String book , String name){
        if(book.equals(name)){
            return true;
        }
        else{
            return false;
        }
    }

    //method to check if you can borrow books from library 1
    public static void canBorrowBook1(String book, String name){
        if (isBookAvailable(book, name) == true) {
            System.out.println("Book has been successfully borrowed from library 1");
        }
    }

    //method to check if you can borrow books from library 2
    public static void canBorrowBook2(String book, String name){
        if (isBookAvailable(book, name) == true) {
            System.out.println("Book has been successfully borrowed from library 2");
        } 
    }
    
    //method to check if you can return book
    public static void canReturnBook(String book, String name){
        if(isBookAvailable(book, name) == true){
            System.out.println("Book successfully returned.");
        }
    }
}
