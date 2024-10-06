package Generic_Count_Method_Double;

import java.util.ArrayList;

public class Swap_Box <T extends Comparable<T>> {

    private final ArrayList<T> list;

    Swap_Box() {
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

    public void swap(int n1, int n2){
        if(n1 < this.list.size() && n2 < this.list.size()) {
            T value = this.list.get(n1);

            this.list.set(n1, this.list.get(n2));
            this.list.set(n2, value);
        }
    }

}
