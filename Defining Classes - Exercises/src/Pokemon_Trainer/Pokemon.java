package Pokemon_Trainer;

public class Pokemon {
    private String name;
    private String element;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private int health;

    Pokemon (String name, String element, int health){
        this.name = name;
        this.element = element;
        this.health = health;
    }

}
