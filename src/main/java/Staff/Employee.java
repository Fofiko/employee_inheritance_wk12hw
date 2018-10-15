package Staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private double salary;

    public Employee(String name, String NINumber, double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name != "") this.name = name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public void setNINumber(String NINumber) {
        this.NINumber = NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double increment) {
        if (increment < 0) {
            this.salary = salary;
        }
        else {
            this.salary += increment;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
