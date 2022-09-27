package assignments.q3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Library> books = new HashSet<>();
        books.add(new Library(2,"Power of brain","sukhmani"));
        books.add(new Library(1,"Power of brain","sukhmani"));
        books.add(new Library(2,"Every thing","kaml"));
        books.add(new Library(3,"brain","kamal"));
        books.add(new Library(4,"Strong mind","sukhmani"));
        System.out.println("Books-----------------------------");
        Iterator<Library> it = books.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Set<Members> members = new TreeSet<>();
        members.add(new Members(1,"sukhmani",24,12));
        members.add(new Members(1,"kamal",24,22));
        members.add(new Members(2,"yash",32,10));
        members.add(new Members(2,"mannat",32,9));
        members.add(new Members(5,"manshu",27,1));
        members.add(new Members(4,"soni",31,5));
        members.add(new Members(4,"cheery",31,17));
        System.out.println("Members-----------------------------");
        Iterator<Members> itt = members.iterator();
        while (itt.hasNext()){
            System.out.println(itt.next());
        }
    }
}
