//single responsibility 
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Methods for book information
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class BookPrinter {
    public void printBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Learn Programming ", "mr X");
        BookPrinter printer = new BookPrinter();

        printer.printBookDetails(book);
    }
}
