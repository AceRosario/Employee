public class Employee {
    protected String name;
    protected double salary; //

    public Employee(String n, double s){
        this.name = n;
        this.salary = s;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double computeBonus() {
        return 0;
    }
}
