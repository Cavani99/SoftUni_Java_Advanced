package ComparableBook;


public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("WOT", 1990, "Martin", "Brandon Sanderson");
        Book bookTwo = new Book("Reaper`s Gale", 2005, "Steven Erikson");
        Book bookThree = new Book("Storm of Swords", 1998, "George R.R. Martin", "Kristian");

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
        } else {
            System.out.println("Book are equal");
        }

    }
}
