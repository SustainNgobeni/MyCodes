import java.util.ArrayList;

class Library{

     static ArrayList<String> library1Books = new ArrayList<String>();
     static ArrayList<String> library2Books = new ArrayList<String>();

     static void printAvailableBooks1(){
        System.out.println("Books available in Library 1:");
        for(int i=0; i<library1Books.size();i++){
            System.out.print( library1Books.get(i) + " ");
        }
     }

     static void printAvailableBooks2(){
      System.out.println("Books available in Library 2:");
        for(int j=0; j<library1Books.size();j++){
            System.out.print( library2Books.get(j) + " ");
        }
     }

     static void borrowBook1(String book){
      for(int i=0; i<library1Books.size();i++){
             Book.canBorrowBook1(book , library1Books.get(i));
     }
 }

     static void borrowBook2(String book){
      for(int j=0; j<library2Books.size();j++){
             Book.canBorrowBook2(book , library2Books.get(j));     
     }
 }

     static void returnBook(){
        
     }
   
}