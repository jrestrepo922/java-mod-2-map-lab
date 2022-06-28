import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> collectionOfBooks;


    public Library() {
        this.collectionOfBooks = new HashMap<String, Book>();
    }


    public HashMap<String, Book> getCollectionOfBooks() {
        return collectionOfBooks;
    }


    public void setCollectionOfBooks(HashMap<String, Book> collectionOfBooks) {
        this.collectionOfBooks = collectionOfBooks;
    }

    

    
}
