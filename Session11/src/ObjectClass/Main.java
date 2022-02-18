package ObjectClass;

public class Main {
    public static void main(String[] args) {
        ObjectClass objectClass = new ObjectClass();
        System.out.println(objectClass.toString());

        String name = "vahid";
        String name1 = "Vahid";
        System.out.println(name.equals(name1));

        System.out.println(objectClass.getClass());
    }
}
