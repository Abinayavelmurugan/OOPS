package library;
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void borrowBook(Library library, String bookTitle) {
        Book book = library.findBook(bookTitle);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(Library library, String bookTitle) {
        Book book = library.findBook(bookTitle);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}
