import java.util.Scanner;

class Main{

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
        Library.library1Books.add("scoa021");
        Library.library1Books.add("scoa022");
        Library.library1Books.add("ssta021");
        Library.library1Books.add("ssta0022");
        Library.library1Books.add("smta021");
        Library.library1Books.add("smta022");

        //adding books to library2 arraylist
        Library.library2Books.add("scsc011");
        Library.library2Books.add("scsc012");
        Library.library2Books.add("ssts011");
        Library.library2Books.add("ssts012");
        Library.library2Books.add("smth011");
        Library.library2Books.add("smth012");

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
        name = input.nextLine();
        

        System.out.println("Enter 1 to borrow book");
        System.out.println("Enter 2 to borrow book");
    }
}