package List_Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerScale = new ArrayList<>();
        Collections.addAll(integerScale, 1,2,3,5,12,20);

        Integer max = ListUtils.getMax(integerScale);

        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a", "bca", "1aa", "-");

        String min = ListUtils.getMin(strings);

        System.out.println(max);
        System.out.println(min);
    }
}
