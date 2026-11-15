package ex.com;

import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book();
        lib.addBook(b1);
        lib.addCategory("Informatique");
        lib.addCategory("Informatique"); // ignoré : Set

        System.out.println("Trouvé : " + lib.findByIsbn("978-2123456803"));
        System.out.println("Emprunt Alice : " + lib.borrowBook(b1, "Alice"));   // true
        System.out.println("Emprunt Bob   : " + lib.borrowBook(b1, "Bob"));     // false
        System.out.println("Restitution   : " + lib.returnBook(b1));            // true
        System.out.println("Emprunt Bob   : " + lib.borrowBook(b1, "Bob"));     // true
        System.out.println("Catégories    : " + lib.getCategories());
    }
}
