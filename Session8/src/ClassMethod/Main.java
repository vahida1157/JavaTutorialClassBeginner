package ClassMethod;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("vahid", 23, 186, 5_000_000);
        Employee employee2 = new Employee("vahid", 23, 230, 10_000_000);
        System.out.println(Employee.sayHello());
        float v = employee1.salaryPerHour();
        float v1 = employee2.salaryPerHour();
        System.out.println(v);
        System.out.println(v1);
    }


}
