package ListyIterator;


import java.util.Iterator;

public class List<String> implements Iterator<String> {

    private int count;
    private String[] strings;

    @Override
    public boolean hasNext() {
        return this.strings.length > this.count + 1;
    }

    @Override
    public String next() {
        return strings[count++];
    }

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

}
