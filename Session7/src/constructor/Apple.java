package constructor;

public class Apple {
    String color;
    String taste;
    int priceInKg;
    int weight;

    public Apple(String color, String taste, int priceInKg, int weight) {
        this.color = color;
        this.taste = taste;
        this.priceInKg = priceInKg;
        this.weight = weight;
    }

    public Apple(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }
}
