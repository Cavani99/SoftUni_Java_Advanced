package Car_Salesman;

public class Car {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Engine engine;

    private String weight;
    private String color;

    Car (String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    @Override
    public String toString() {

        return this.model + ":\n" +
                this.engine.getModel() + ":\n" +
                "Power: " + this.engine.getPower() + "\n" +
                "Displacement: " + this.engine.getDisplacement() + "\n" +
                "Efficiency: " + this.engine.getEfficiency() + "\n" +
                "Weight: " + this.weight + "\n" +
                "Color: " + this.color;
    }
}
