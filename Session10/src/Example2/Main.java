package Example2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal1");
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
            return new Animal("animal");
        else if (flag && true)
            return new Fish("fish");
        return new Main();
    }

}
