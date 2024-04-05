import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        Library library1 = new Library("Library1");
        Library library2 = new Library("Library2");

        library1.addBook("scoa");
        library1.addBook("ssta");
        library1.addBook("smta");

        library2.addBook("scsc");
        library2.addBook("ssts");
        library2.addBook("smth");

        System.out.println("Books available in " + library1.getlibraryName() + ":");
        library1.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in " + library1.getlibraryName() + ":");
        library2.printAvailableBooks();

        System.out.println("\nEnter 1 to borrow book from library1");
        System.out.println("Enter 2 to return book to library1");
        System.out.println("Enter 3 to borrow book from library2");
        System.out.println("Enter 4 to return book to library2");
        while(!(input.hasNextInt())) {
            System.out.print("Enter correct number!!!!");
            input.next();
        }
        num = input.nextInt();

        if( num == 1){
        }
        else if( num == 2){

        }
        else if( num == 3){
    
        }
        else if( num == 4){

        }
        else{
            System.out.println("Wrong number chosen!!!! Try again");
        }
    }
}
        import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        Library library1 = new Library("Library1");
        Library library2 = new Library("Library2");

        library1.addBook("scoa");
        library1.addBook("ssta");
        library1.addBook("smta");

        library2.addBook("scsc");
        library2.addBook("ssts");
        library2.addBook("smth");

        System.out.println("Books available in " + library1.getlibraryName() + ":");
        library1.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in " + library1.getlibraryName() + ":");
        library2.printAvailableBooks();

        System.out.println("\nEnter 1 to borrow book from library1");
        System.out.println("Enter 2 to return book to library1");
        System.out.println("Enter 3 to borrow book from library2");
        System.out.println("Enter 4 to return book to library2");
        while(!(input.hasNextInt())) {
            System.out.print("Enter correct number!!!!");
            input.next();
        }
        num = input.nextInt();

        if( num == 1){
        }
        else if( num == 2){

        }
        else if( num == 3){
    
        }
        else if( num == 4){

        }
        else{
            System.out.println("Wrong number chosen!!!! Try again");
        }
    }
}
        import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        Library library1 = new Library("Library1");
        Library library2 = new Library("Library2");

        library1.addBook("scoa");
        library1.addBook("ssta");
        library1.addBook("smta");

        library2.addBook("scsc");
        library2.addBook("ssts");
        library2.addBook("smth");

        System.out.println("Books available in " + library1.getlibraryName() + ":");
        library1.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in " + library1.getlibraryName() + ":");
        library2.printAvailableBooks();

        System.out.println("\nEnter 1 to borrow book from library1");
        System.out.println("Enter 2 to return book to library1");
        System.out.println("Enter 3 to borrow book from library2");
        System.out.println("Enter 4 to return book to library2");
        while(!(input.hasNextInt())) {
            System.out.print("Enter correct number!!!!");
            input.next();
        }
        num = input.nextInt();

        if( num == 1){
        }
        else if( num == 2){

        }
        else if( num == 3){
    
        }
        else if( num == 4){

        }
        else{
            System.out.println("Wrong number chosen!!!! Try again");
        }
    }
}
        
