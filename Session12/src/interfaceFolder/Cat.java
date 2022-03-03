package interfaceFolder;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Meow Meow";
    }

    @Override
    public boolean canHunt() {
        return true;
    }

    @Override
    public boolean eatMeat() {
        return false;
    }
}
