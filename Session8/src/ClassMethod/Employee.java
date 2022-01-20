package ClassMethod;

public class Employee {
    String name;
    int age;
    int workPerMonth;
    int salaryPerMonth;

    public Employee(String name, int age, int workPerMonth, int salaryPerMonth) {
        this.name = name;
        this.age = age;
        this.workPerMonth = workPerMonth;
        this.salaryPerMonth = salaryPerMonth;
    }

    public float salaryPerHour() {
        return ((float) (salaryPerMonth / workPerMonth));
    }

    public static String sayHello() {
        return "Hello";
    }


}
