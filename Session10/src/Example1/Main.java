package Example1;

import Example1.Classes.Animal;
import Example1.Classes.Cat;
import Example1.Classes.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("High");
        Cat cat = new Cat();
        System.out.println(dog.getGender());
    }
}
