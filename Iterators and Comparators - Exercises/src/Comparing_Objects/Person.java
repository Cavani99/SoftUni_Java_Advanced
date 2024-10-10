package Comparing_Objects;



public class Person implements Comparable<Person>{

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    private String name;
    private int age;
    private String town;


    Person(String name, int age, String town){
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person person) {
        if(this.getName().compareTo(person.getName()) == 0){
            if(this.getAge() == person.getAge()){
                if(this.getTown().compareTo(person.getTown()) == 0) {
                    return 0;
                }
            }
        }
        return -1;
    }
}
