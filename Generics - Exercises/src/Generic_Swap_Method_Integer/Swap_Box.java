package Generic_Swap_Method_Integer;

import java.util.ArrayList;

public class Swap_Box <T> {

    private final ArrayList<T> list;

    Swap_Box() {
        this.list = new ArrayList<>();
    }

    public void printList() {
        for (int i = 0; i < this.list.size(); i++) {
            String cl = this.list.get(i).getClass().getName();
            System.out.println(String.format("%s: %s", cl, this.list.get(i)));
        }

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
