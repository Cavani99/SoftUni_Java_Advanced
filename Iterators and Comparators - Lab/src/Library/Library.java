package Library;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {

    private final class LibraryIterator implements Iterator<Book> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return books.length > counter;
        }

        @Override
        public Book next() {
            return books[ counter++];
        }
    }

    public Library(Book... books){
        this.books = books;
    }
    private Book[] books;

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }
}
