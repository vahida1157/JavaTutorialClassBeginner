package Example2;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "Meow Meow";
    }
}
