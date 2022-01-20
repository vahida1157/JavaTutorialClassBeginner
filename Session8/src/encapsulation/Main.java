package encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("vahid", 23, 200, 5000000);
        System.out.println(employee.getName());
        employee.setName("mohammad");
        System.out.println(employee.getName());
    }
}
