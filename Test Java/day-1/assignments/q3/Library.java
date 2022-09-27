package assignments.q3;

import java.util.Objects;

public class Library {
    //bookId(Unique_id),bookName,BookAuthor Main Runner class.

    int bookId;
    String bookName;
    String bookAuthor;

    public Library(int bookId, String bookName, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return bookId == library.bookId;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }
}
