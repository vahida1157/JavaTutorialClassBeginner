package Example;

public class Employee {
    private final String firstName;
    private final String lastName;
    private int salaryPerMonth;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAnnualSalary() {
        return salaryPerMonth * 12;
    }

    public void raiseSalary(int percent) {
        this.salaryPerMonth *= (1 + (percent / 100.0));
    }
}
