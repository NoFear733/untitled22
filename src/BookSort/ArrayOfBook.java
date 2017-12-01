package BookSort;
import java.util.ArrayList;
import java.util.List;

class ArrayOfBook {

    List <Book> listOfBook = new ArrayList<Book>();

    public void addBook(String n, String path, String id ) {
    
        Book b = new BookBasic(n, path, id); 
        
        listOfBook.add(b);
    }

    public void addBookFlibusta(String n, String path, String id, String id2 ) {
    
        BookFlibusta b = new BookFlibusta(n, path, id, id2);
        
        listOfBook.add(b);
    }
}