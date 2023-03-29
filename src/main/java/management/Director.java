package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NI_number, double salary, String deptName, double budget) {
        super(name, NI_number, salary, deptName);
        this.budget = budget;
    }


    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
