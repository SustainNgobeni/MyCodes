import java.util.ArrayList;

public class Library {

     //Creates arrayList objects. Also declare and initialize x 
     static ArrayList<String> library1Books = new ArrayList<String>();
     static ArrayList<String> library2Books = new ArrayList<String>();
     int x=1;

     //method that sorts and printlns library1Books
     public static void printAvailableBooks1(){
        System.out.println("Books available in Library 1:");
        for(int i=0; i<library1Books.size();i++){
            System.out.print( library1Books.get(i) + " ");
        }
     }

     //method that sorts and printlns library2Books
     public static void printAvailableBooks2(){
      System.out.println("Books available in Library 2:");
        for(int j=0; j<library2Books.size();j++){
            System.out.print( library2Books.get(j) + " ");
        }
     }

     //method to borrow books from library1
     public static void borrowBook1(String book , int x){
      for(int i=0; i<library1Books.size();i++){
        if(book.equals(library1Books.get(i))){
             Book.canBorrowBook1(book , library1Books.get(i));
             x--;
        }
     }
     if(x == 1){
        System.out.println("Book not available!!!");
      }
    }
     //method to borrow books from library2
     public static void borrowBook2(String book , int x){
        for(int j=0; j<library2Books.size();j++){
             if(book.equals(library2Books.get(j))){
                Book.canBorrowBook2(book , library2Books.get(j));
                x--;
               }
              }
              if(x == 1){
              System.out.println("Book not available!!!");
                }
      }

     //method to return book to library1
     public static void returnBook1(String book , int x){
         for(int p=0; p<library1Books.size();p++){
             if(book.equals(library1Books.get(p))){
               Book.canReturnBook(book , library1Books.get(p) );
               x--;
              }
            }
            if(x == 1){
            System.out.println("Book cannot be returned");
            }
    }

    //method to return book to library2
    public static void returnBook2(String book , int x){
        for(int a=0; a<library2Books.size();a++){
             if(book.equals(library2Books.get(a))){
             Book.canReturnBook(book , library1Books.get(a) );
             x--;
             }
            }
             if(x == 1){
             System.out.println("Book cannot be returned");
         }
      }

}
