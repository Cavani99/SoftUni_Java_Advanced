package Custom_List_Sorter;

import java.util.ArrayList;


public class Box<T extends Comparable<T>> {

    private final ArrayList<T> list;

    Box() {
        this.list = new ArrayList<>();
    }

    public int greater(T element) {
        int count = 0;

        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).compareTo(element) > 0)
                count++;
        }

        return count;
    }

    public void add(T value){
        this.list.add(value);
    }

    public T remove(int index){
        return this.list.remove(index);
    }

    public boolean contains(T element){
        return this.list.contains(element);
    }

    public void swap(int n1, int n2){
        if(n1 < this.list.size() && n2 < this.list.size()) {
            T value = this.list.get(n1);

            this.list.set(n1, this.list.get(n2));
            this.list.set(n2, value);
        }
    }

    public T getMax(){
        if(this.list.isEmpty())
            throw new IllegalArgumentException();
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0)
                max = list.get(i);
        }
        return max;
    }

    public T getMin(){
        if(list.isEmpty())
            throw new IllegalArgumentException();
        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0)
                min = list.get(i);
        }
        return min;
    }

    public void printList() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(String.format("%s", this.list.get(i)));
        }

    }

    public void sort() {
        this.list.sort(Comparable::compareTo);
    }

}
