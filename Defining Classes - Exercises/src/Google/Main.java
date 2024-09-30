package Google;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] command = scanner.nextLine().split("\\s+");

        LinkedHashSet<Pokemons> pokemonLinkedHashSet;
        LinkedHashSet<Parent> parentLinkedHashSet;
        LinkedHashSet<Child> childLinkedHashSet;
        LinkedHashMap<String, Person> personSet = new LinkedHashMap<>();

        Person person;
        Car car;
        Pokemons pokemon;
        Child child;
        Parent parent;
        Company company;
        while (!command[0].equals("End")){
            String name = command[0];

            switch (command[1]){
                case "company":
                    company = new Company(command[2], command[3], Double.parseDouble(command[4]));
                    person = personSet.get(name);

                    if(person == null) {
                        person = new Person(name);
                    }
                    person.setCompany(company);

                    personSet.put(command[0], person);
                    break;
                case "car":
                    car = new Car(command[2], Integer.parseInt(command[3]));
                    person = personSet.get(name);

                    if(person == null) {
                        person = new Person(name);
                    }
                    person.setCar(car);

                    personSet.put(command[0], person);
                    break;
                case "pokemon":
                    if(personSet.containsKey(name)){
                        person = personSet.get(name);
                        pokemon = new Pokemons(command[2], command[3]);
                        pokemonLinkedHashSet = person.getPokemons();

                        if(pokemonLinkedHashSet == null) {
                            Pokemons finalPokemon = pokemon;
                            pokemonLinkedHashSet = new LinkedHashSet<>(){{add(finalPokemon);}};
                        } else {
                            pokemonLinkedHashSet.add(pokemon);
                        }

                    } else {
                        pokemon = new Pokemons(command[2], command[3]);
                        Pokemons finalPokemon = pokemon;

                        pokemonLinkedHashSet = new LinkedHashSet<>(){{add(finalPokemon);}};
                        person = new Person(name);
                    }
                    person.setPokemons(pokemonLinkedHashSet);
                    personSet.put(name, person);
                    break;
                case "parents":
                    if(personSet.containsKey(name)){
                        person = personSet.get(name);
                        parent = new Parent(command[2], command[3]);
                        parentLinkedHashSet = person.getParents();

                        if(parentLinkedHashSet == null) {
                            Parent finalParent = parent;
                            parentLinkedHashSet = new LinkedHashSet<>(){{add(finalParent);}};
                        } else {
                            parentLinkedHashSet.add(parent);
                        }

                    } else {
                        parent = new Parent(command[2], command[3]);
                        Parent finalParent = parent;

                        parentLinkedHashSet = new LinkedHashSet<>(){{add(finalParent);}};
                        person = new Person(name);
                    }
                    person.setParents(parentLinkedHashSet);
                    personSet.put(name, person);
                    break;
                case "children":
                    if(personSet.containsKey(name)){
                        person = personSet.get(name);
                        child = new Child(command[2], command[3]);
                        childLinkedHashSet = person.getChildren();

                        if(childLinkedHashSet == null) {
                            Child finalChild = child;
                            childLinkedHashSet = new LinkedHashSet<>(){{add(finalChild);}};
                        } else {
                            childLinkedHashSet.add(child);
                        }

                    } else {
                        child = new Child(command[2], command[3]);
                        Child finalChild = child;

                        childLinkedHashSet = new LinkedHashSet<>(){{add(finalChild);}};
                        person = new Person(name);
                    }
                    person.setChildren(childLinkedHashSet);
                    personSet.put(name, person);
                    break;

            }

            command = scanner.nextLine().split("\\s+");
        }

        String personToPrint = scanner.nextLine();
        person = personSet.get(personToPrint);
        System.out.println(person.toString());


    }
}
