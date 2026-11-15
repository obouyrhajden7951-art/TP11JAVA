package ex.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final Set<String> categories = new TreeSet<>();
    private final Map<String, Book> isbnIndex = new HashMap<>();
    private final Map<Book, String> loans = new HashMap<>();

    public boolean addBook(Book b1) {
        if (isbnIndex.containsKey(((Book) b1).getIsbn())) return false;
        books.add(b1);
        isbnIndex.put(b1.getIsbn(), b1);
        return true;
    }

    public void addCategory(String category) { categories.add(category); }

    public Book findByIsbn(String isbn) { return isbnIndex.get(isbn); }

    public boolean borrowBook(java.awt.print.Book b1, String borrower) {
        if (!isbnIndex.containsKey(((Book) b1).getIsbn()) || loans.containsKey(b1)) return false;
        loans.put(b1, borrower);
        return true;
    }

    public boolean returnBook(java.awt.print.Book b1) { return loans.remove(b1) != null; }

    public String borrowerOf(Book book) { return loans.get(book); }

    public List<Book> getBooks() { return Collections.unmodifiableList(books); }
    public Set<String> getCategories() { return Collections.unmodifiableSet(categories); }

	public void addBook(java.awt.print.Book b1) {
		// TODO Auto-generated method stub
		
	}
}