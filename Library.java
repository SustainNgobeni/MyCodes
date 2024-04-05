import java.util.ArrayList;

public class Library {
    private String libraryName;
    private String [] books = new String[3];

    public Library(String libraryName){
        this.libraryName = libraryName;
    }
    
    public String getlibraryName(){
        return libraryName;
    }

    public void setlibraryName(String libraryName){
        this.libraryName = libraryName;
    }

    public void addBook(String book){
        for(int i=0; i<books.length; i++){
           books[i] = book; 
        }
    }

    public void printAvailableBooks(){
        int high = books.length;
        int low = 0;
        if(high >= low){
            for(int i=0; i<books.length; i++){
                System.out.print(books[i] + " "); 
             }
        }
        else{
            System.out.print("No books available!!!1");
        }
    }
 }
