package Google;

public class Car {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;

    Car (String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

}
