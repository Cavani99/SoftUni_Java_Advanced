package Strategy_Pattern;



public class Person{

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    private String name;
    private int age;


    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}
