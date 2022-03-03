package interfaceFolder;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Hop Hop";
    }

    @Override
    public boolean canHunt() {
        return true;
    }

    @Override
    public boolean eatMeat() {
        return true;
    }
}
