package Raw_Data;

public class Cargo {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    private String type;

    Cargo(int weight, String type){
        this.weight = weight;
        this.type = type;
    }

}
