package BookComparator;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("WOT", 1990, "Martin", "Brandon Sanderson");
        Book bookTwo = new Book("Reaper`s Gale", 2005, "Steven Erikson");
        Book bookThree = new Book("Storm of Swords", 1998, "George R.R. Martin", "Kristian");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new BookComparator());

        for (Book book: books) {
            System.out.println(book.getTitle() + book.getYear());
        }

    }
}
