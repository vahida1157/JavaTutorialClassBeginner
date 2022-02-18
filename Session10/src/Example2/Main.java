package Example2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal1") {
            @Override
            public String greet() {
                return null;
            }
        };
        animal.greet();
        Animal dog = new Dog("dog1");
        Cat cat = new Cat("cat1");

        Animal animal1 = creatAnimal(true);
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        cat.setName("caty");
        System.out.println(cat.getName());

        printInformation(animal);
        printInformation(dog);
        printInformation(cat);
        Fish fish = new Fish("redFish");
        System.out.println(fish.greet());
    }

    public static void printInformation(Animal animal) {
        System.out.println("the name is : " + animal.getName() + " and the sound is : " + animal.greet());
    }

    public static Animal creatAnimal(boolean isDog) {
        if (isDog)
            return new Dog("dog");
        else
            return new Cat("cat");
    }

    public static Object createObject(boolean flag) {
        if (flag)
            return new Animal("animal") {
                @Override
                public String greet() {
                    return "make the sound";
                }
            };
        else if (flag && true)
            return new Fish("fish");
        return new Main();
    }

}
