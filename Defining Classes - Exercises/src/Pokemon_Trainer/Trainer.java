package Pokemon_Trainer;

import java.util.LinkedHashSet;

public class Trainer {
    private String name;
    private int badges;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public LinkedHashSet<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(LinkedHashSet<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    private LinkedHashSet <Pokemon> pokemons;

    Trainer(String name, LinkedHashSet <Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }
}
