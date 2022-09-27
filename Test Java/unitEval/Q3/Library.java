package unitEval.Q3;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class Library {
    public static void main(String[] args) {
        LinkedHashSet<Book> booksCollection = new LinkedHashSet<>();
        booksCollection.add(new Book(1,"Maninder","Author1"));
        booksCollection.add(new Book(2,"Kamal","Author2"));
        booksCollection.add(new Book(3,"Yash","Author1"));
        booksCollection.add(new Book(1,"Mannat","Author1"));
        System.out.println(booksCollection.size());




    }
}
