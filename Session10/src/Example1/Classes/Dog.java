package Example1.Classes;

public class Dog extends Animal {
    private String intelligence;

    public Dog(String intelligence) {
        this.intelligence = intelligence;
        this.gender = 'm';
    }

    public char getGender() {
        return gender;
    }
}
