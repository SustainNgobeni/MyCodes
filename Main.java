import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare variables
        String name;
        int num;
        
        //adding books to library1 arraylist
        Library.library1Books.add("scoabook");
        Library.library1Books.add("smtabook");
        Library.library1Books.add("sstabook");

        //adding books to library2 arraylist
        Library.library2Books.add("scscbook");
        Library.library2Books.add("smthbook");
        Library.library2Books.add("sstsbook");

        //Prints available books , welcome message , opening and closing time
        System.out.println("Welcome to Mountain Caves Library(Open from 9AM - 5Pm daily)\n");
        System.out.println("List of the available books in our 2 libraries");
        asterisk();
        Library.printAvailableBooks1();
        System.out.println("\n");
        Library.printAvailableBooks2();
        System.out.println();
        asterisk();
        System.out.println();
        
        Book.bookTitle();
        //Input valid to check if user entered a valid name
        while(!(input.hasNext("[A-Za-z]*"))) {
            System.out.print("enter correct name!!!!");
            input.next();
        }
        name = input.next();
        System.out.println();

        //promts user to choose an option
        System.out.println("Enter 1 to borrow book from library1");
        System.out.println("Enter 2 to return book to library1");
        System.out.println("Enter 3 to borrow book from library2");
        System.out.println("Enter 4 to return book to library2");

        //Input validation to check if user entered a number
        while(!(input.hasNextInt())) {
            System.out.print("enter correct number!!!!");
            input.next();
        }
        num = input.nextInt();

        //switch statement to check option chosen by user
        switch(num){
            case 1:
                Library.borrowBook1(name , 1);
                break;
            case 2:
                Library.returnBook1(name , 1);
                break;
            case 3:
                Library.borrowBook1(name , 1);
                break;
            case 4:
                Library.returnBook1(name , 1);
                break;    
            default:
                System.out.println("Wrong number chosen!!!! Try again");    
        }
    }

    //method that prints asterisk
    static void asterisk(){
        for(int i=0; i<55; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
