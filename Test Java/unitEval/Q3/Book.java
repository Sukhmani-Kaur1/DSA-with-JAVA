package unitEval.Q3;

import java.util.Objects;

public class Book {
    int bookId;
    String bookName;
    String author;

    public Book(int bookId,String bookName,String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return bookId != book.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, author);
    }

}
