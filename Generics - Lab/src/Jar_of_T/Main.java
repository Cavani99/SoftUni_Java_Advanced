package Jar_of_T;

public class Main {


    public static void main(String[] args) {
        Jar<String> jarOfPickles = new Jar<>();
        Jar<Integer> integers = new Jar<>();

        jarOfPickles.add("hi");
        jarOfPickles.add("two");

        integers.add(3);
        integers.add(5);

        String text = jarOfPickles.remove();
        System.out.println(text);
    }

}
