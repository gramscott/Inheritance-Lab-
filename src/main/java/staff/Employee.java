package staff;

public class Employee {

    private String name;

    private String NI_number;

    private double salary;

    public Employee( String name, String NI_number, double salary){
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNI_number() {
        return NI_number;
    }

    public void setNI_number(String NI_number) {
        this.NI_number = NI_number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        this.salary += raise;
    }

    public double payBonus(){
        return this.salary / 100;
    }




}
