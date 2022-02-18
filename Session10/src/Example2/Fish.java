package Example2;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String greet() {
        return "fish fish";
    }
}
