package ex.com;
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("978-2123456803", "Java Avancé", "Auteur A");
        lib.addBookIndexed(b1);

        lib.borrowBook(b1, "Alice");
        System.out.println("Livre trouvé par ISBN : " + lib.findByIsbn("978-2123456803"));

        // Cycle complet de prêt
        System.out.println("Alice emprunte : " + lib.borrowBook(b1, "Alice"));   // false (déjà emprunté)
        System.out.println("Bob emprunte : " + lib.borrowBook(b1, "Bob"));       // false (déjà emprunté)
        lib.returnBook(b1);
        System.out.println("Bob emprunte après retour : " + lib.borrowBook(b1, "Bob")); // true
    }
}
