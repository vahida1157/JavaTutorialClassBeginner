package encapsulation;

public class Employee {
    private String name;
    private int age;
    private int workPerMonth;
    private int salaryPerMonth;

    public Employee(String name, int age, int workPerMonth, int salaryPerMonth) {
        this.name = name;
        this.age = age;
        this.workPerMonth = workPerMonth;
        this.salaryPerMonth = salaryPerMonth;
    }

    public Employee(int workPerMonth, int salaryPerMonth) {
        this.workPerMonth = workPerMonth;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name changed");
    }

}
