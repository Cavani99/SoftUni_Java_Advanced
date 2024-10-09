package Collection;


import java.util.Iterator;

public class List<String> implements Iterator<String>, Iterable<String> {

    @Override
    public boolean hasNext() {
        return this.strings.length > this.count + 1;
    }

    @Override
    public String next() {
        return strings[count++];
    }

    private final class StringsIterator implements Iterator<String> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return strings.length > counter;
        }

        @Override
        public String next() {
            return strings[counter++];
        }
    }

    private int count;
    private String[] strings;


    public boolean move(){
        if(this.count + 1 < this.strings.length){
            this.count++;
            return true;
        } else
            return false;
    }

    public void print(){
        if(this.strings.length == 0){
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.strings[count]);
        }
    }

    public List(String... strings){
        this.count = 0;
        this.strings = strings;
    }

    @Override
    public Iterator<String> iterator() {
        return new StringsIterator();
    }
}
