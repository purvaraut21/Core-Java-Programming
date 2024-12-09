package Exercise_8;

/* 4. Library System:Design a Book class with attributes like title, 
 *    author, and ISBN. Implement methods to display book details 
 *    and check availability. Create a Library class that can manage 
 *    a collection of books (add, remove, and search for books).
 * 
 */

class Book {
     String title;
     String author;
     String ISBN;
    boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBNo: " + ISBN);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

class Library {
    private Book[] books;
    private int numBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full.");
        }
    }

    public void removeBook(String ISBN) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].ISBN.equals(ISBN)) {
                for (int j = i; j < numBooks - 1; j++) {
                    books[j] = books[j + 1];
                }
                numBooks--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public Book searchBook(String ISBN) {
        for (Book book : books) {
            if (book.ISBN.equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book("To be good to be true ", "Trish Perry", "B09GXHNJ12");
        Book book2 = new Book("The Greatest Secret", "Rhonda Byrne", "B08FTK95WG");
        Book book3 = new Book("A Brief History of Humankind", "Yuval Noah Harari", "0099590085");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.searchBook("0-547-99501-3").displayDetails();

        library.removeBook("1-84159-413-5");
    }
}
