import java.util.Scanner;

public class Main {
    
   static void asterisk(){
        for(int i=0; i<55; i++){
            System.out.print("*");
        }
        System.out.println();
    }
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int num;
        
        //adding books to library1 arraylist
        Library.library1Books.add("scoabook");
        Library.library1Books.add("smtabook");
        Library.library1Books.add("sstabook");

        //adding books to library2 arraylist
        Library.library2Books.add("scscbook");
        Library.library2Books.add("scscbook");
        Library.library2Books.add("sstsbook");

        System.out.println("Welcome to Mountain Caves Library\n");
        System.out.println("List of the available books in our 2 libraries");
        asterisk();
        Library.printAvailableBooks1();
        System.out.println("\n");
        Library.printAvailableBooks2();
        System.out.println();
        asterisk();
        System.out.println();
        
        Book.bookTitle();
        while(!(input.hasNext("[A-Za-z]*"))) {
            System.out.print("enter correct name!!!!");
            input.next();
        }
        name = input.next();
        System.out.println();

        System.out.println("Enter 1 to borrow book from library1");
        System.out.println("Enter 2 to return book to library1");
        System.out.println("Enter 3 to borrow book from library2");
        System.out.println("Enter 4 to return book to library2");
        while(!(input.hasNextInt())) {
            System.out.print("enter correct number!!!!");
            input.next();
        }
        num = input.nextInt();

        if( num == 1){
            Library.borrowBook1(name , 1);    
        }
        else if( num == 2){
            Library.returnBook1(name, 1);
        }
        else if( num == 3){
            Library.borrowBook2(name, 1);
        }
        else if( num == 4){
            Library.returnBook2(name, 1);  
        }
        else{
            System.out.println("Wrong number chosen!!!! Try again");
        }
    }
}
