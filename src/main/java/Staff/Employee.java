package Staff;

public abstract class Employee {

    private String name;
    private String INnumber;
    private double salary;

    public Employee(String name, String INnumber, double salary){
        this.name = name;
        this.INnumber = INnumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getINnumber() {
        return INnumber;
    }

    public void setINnumber(String INnumber) {
        this.INnumber = INnumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increment) {
        this.salary += increment;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
