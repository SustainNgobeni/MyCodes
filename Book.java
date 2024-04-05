public class Book {
    
    //fields of book class
    private String bookName;
    private boolean isAvailable;

    

    public void canBorrowBook(String bookName , String name){
        if(isAvailable){
            System.out.print("Book is not available!!!");
        }
        else{
            System.out.print("Book is available.");
        }
    }

    public void canReturnBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("Book successfully returned.");
        }
        else{
            System.out.println("Book cannot be returned!!1!1");
        }
    }
}
