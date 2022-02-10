package Example2;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Woof Woof";
    }
}
