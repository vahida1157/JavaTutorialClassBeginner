package constructor;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("red", "shirin", 20000, 300);
        Apple apple1 = new Apple("green", "torsh");

        printAppleInformation(apple);
        System.out.println("-------");
        printAppleInformation(apple1);
        apple.color = "yellow";
    }

    static void printAppleInformation(Apple apple) {
        System.out.println("color: " + apple.color
                + "\ntaste: " + apple.taste
                + "\nprice: " + apple.priceInKg
                + "\nweight: " + apple.weight);
    }
}
