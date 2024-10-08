package Library;


public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("WOT", 1990, "Martin", "Brandon Sanderson");
        Book bookTwo = new Book("Reaper`s Gale", 2005, "Steven Erikson");
        Book bookThree = new Book("Storm of Swords", 1998, "George R.R. Martin", "Kristian");

        Library<Book> library = new Library<>(bookOne, bookTwo, bookThree);
        for (Book book: library) {
            System.out.println(book.getTitle());
        }

    }
}
