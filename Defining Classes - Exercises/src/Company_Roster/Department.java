package Company_Roster;

public class Department {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int amount;
    private double salary;

    Department(String name, double salary){
        this.name = name;
        this.salary = salary;
        this.amount = 1;
    }

    public void addCount(){
        this.amount++;
    }

    public void addSalary(double salary){
        this.salary += salary;
    }

    public double getAverage(){
       return this.salary / this.amount;
    }
}
