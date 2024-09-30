package Google;

import java.util.LinkedHashSet;
import java.util.Locale;

public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LinkedHashSet<Pokemons> getPokemons() {
        return pokemons;
    }

    public void setPokemons(LinkedHashSet<Pokemons> pokemons) {
        this.pokemons = pokemons;
    }

    public LinkedHashSet<Parent> getParents() {
        return parents;
    }

    public void setParents(LinkedHashSet<Parent> parents) {
        this.parents = parents;
    }

    public LinkedHashSet<Child> getChildren() {
        return children;
    }

    public void setChildren(LinkedHashSet<Child> children) {
        this.children = children;
    }

    private String name;
    private Company company;
    private Car car;
    private LinkedHashSet<Pokemons> pokemons;
    private LinkedHashSet<Parent> parents;
    private LinkedHashSet<Child> children;

    Person (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder pokemonText = new StringBuilder();
        StringBuilder parentText = new StringBuilder();
        StringBuilder childText = new StringBuilder();
        StringBuilder companyText =  new StringBuilder();
        StringBuilder carText =  new StringBuilder();;


        LinkedHashSet<Pokemons> pokemonsLinkedHashSet = this.pokemons;
        if(pokemonsLinkedHashSet != null){
            pokemonsLinkedHashSet.forEach( (p) -> pokemonText.append(p.getName()).append(" ").append(p.getType()).append("\n"));
        }

        LinkedHashSet<Parent> parentLinkedHashSet = this.parents;
        if(parentLinkedHashSet != null){
                parentLinkedHashSet.forEach( (p) -> parentText.append(p.getName()).append(" ").append(p.getBirthday()).append("\n"));
        }


        LinkedHashSet<Child> childLinkedHashSet = this.children;
        if(childLinkedHashSet != null){
                childLinkedHashSet.forEach( (p) -> childText.append(p.getName()).append(" ").append(p.getBirthday()).append("\n"));
        }

        Company company =this.company;
        if(company != null){
            companyText.append(this.company.getName()).append(" ").append(this.company.getDepartment()).append(" ")
                    .append(String.format(Locale.US,"%.2f", this.company.getSalary())).append("\n");
        }

        Car car =this.car;
        if(car != null){
            carText.append(this.car.getModel()).append(" ").append(this.car.getSpeed()).append("\n");
        }

        return this.name + "\n" +
                "Company:\n" + companyText +
                "Car:\n" + carText +
                "Pokemon:\n" + pokemonText +
                "Parents:\n" + parentText +
                "Children:\n" + childText;
    }

}
