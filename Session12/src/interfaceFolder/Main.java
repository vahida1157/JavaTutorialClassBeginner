package interfaceFolder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("jack");
        ArrayList<Hunt> hunters = new ArrayList<>();
        hunters.add(dog);
        System.out.println(hunters.get(0).eatMeat());
    }
}
