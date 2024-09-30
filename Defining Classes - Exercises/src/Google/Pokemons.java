package Google;

public class Pokemons {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    Pokemons (String name, String type) {
        this.name = name;
        this.type = type;
    }
}
