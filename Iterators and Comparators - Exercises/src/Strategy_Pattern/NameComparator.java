package Strategy_Pattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if(person1.getName().length() == person2.getName().length()) {
            String name1 = person1.getName();
            char ch1 = Character.toLowerCase(name1.charAt(0));
            String name2 = person2.getName();
            char ch2 = Character.toLowerCase(name2.charAt(0));

            if(ch1 == ch2) {
                return 0;
            } else if (ch1 > ch2) {
                return 1;
            }
            return - 1;
        } else {
            if(person1.getName().length() > person2.getName().length()){
                return 1;
            } else
                return -1;
        }
    }
}
