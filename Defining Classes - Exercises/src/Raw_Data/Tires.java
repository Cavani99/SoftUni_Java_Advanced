package Raw_Data;

public class Tires {
    private int age1;
    private int age2;
    private int age3;
    private int age4;

    private double pressure1;
    private double pressure2;
    private double pressure3;

    public int getAge1() {
        return age1;
    }

    public int getAge2() {
        return age2;
    }

    public int getAge3() {
        return age3;
    }

    public int getAge4() {
        return age4;
    }

    public double getPressure1() {
        return pressure1;
    }

    public double getPressure2() {
        return pressure2;
    }

    public double getPressure3() {
        return pressure3;
    }

    public double getPressure4() {
        return pressure4;
    }

    private double pressure4;

    Tires(double pressure1, int age1, double pressure2, int age2,
          double pressure3, int age3, double pressure4, int age4 ){
        this.age1 = age1;
        this.age2 = age2;
        this.age3 = age3;
        this.age4 = age4;

        this.pressure1 = pressure1;
        this.pressure2 = pressure2;
        this.pressure3 = pressure3;
        this.pressure4 = pressure4;
    }
}
