import java.util.ArrayList;
import java.util.List;

public class BookInventory {
    private ArrayList<Book>booksInventory;

    public BookInventory() {
        booksInventory = new ArrayList<>();
    }
    public void addBooks(Book b){
        booksInventory.add(b);

    }
    public Book searchByISBN(String isbn){
        for (Book book : booksInventory) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> removeBooks() {
        List<Book> toRemove = new ArrayList<>();
        for (Book book : booksInventory) {
            if (book.getYear() < 2019) {
                toRemove.add(book);
            }
        }
     booksInventory.removeAll(toRemove);
        return toRemove;
    }
    public List<Book> getAllBooks() {
        return booksInventory;
    }

    }

