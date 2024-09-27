package Raw_Data;

public class Engine {
    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    private int speed;
    private int power;

    Engine(int speed, int power){
        this.speed = speed;
        this.power = power;
    }
}
