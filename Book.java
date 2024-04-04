public class Book {
    
    static void bookTitle(){
        System.out.print("Enter book name:");
    }
    
    public static boolean isBookAvailable(String book , String name){
        if(book.equals(name)){
            return true;
        }
        else{
            return false;
        }
    }

    static void canBorrowBook(String book, String name){
        if (isBookAvailable(book, name) == true) {
            System.out.println("Book has been successfully borrowed");
        }
    }

    static void canReturnBook(String book, String name){
        if(isBookAvailable(book, name) == true){
            System.out.println("Book successfully returned.");
        }
    }
}
