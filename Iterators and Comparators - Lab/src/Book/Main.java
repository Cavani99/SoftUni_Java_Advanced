package Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("WOT", 1990, "Martin", "Brandon Sanderson");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
    }
}
