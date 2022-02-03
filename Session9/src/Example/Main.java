package Example;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("vahid", "ghasemi", 5_000_000);
        Employee emp2 = new Employee("milad", "nami", 5_500_000);
        Employee emp3 = new Employee("ali", "hemati", 7_000_000);

        System.out.println(emp1.getAnnualSalary());
        System.out.println(emp2.getName());

        System.out.println(emp3.getSalaryPerMonth());
        emp3.raiseSalary(50);
        System.out.println(emp3.getSalaryPerMonth());
    }
}
