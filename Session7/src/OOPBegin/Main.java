package OOPBegin;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        System.out.println(apple.color);
        System.out.println(apple.priceInKg);
        System.out.println("farda ...");
        apple.priceInKg = 35000;
        System.out.println(apple.color);
        System.out.println(apple.priceInKg);
        System.out.println("pas farda ...");
        apple.color = "green";
        System.out.println(apple.color);
        System.out.println(apple.priceInKg);


        Fruit mango = new Fruit();
        Fruit banana = new Fruit();
        printAppleInformation(mango);
        System.out.println("-------");
        printAppleInformation(banana);

        mango.color = "red";
        mango.taste = "shirin";
        mango.priceInKg = 20000;
        mango.weight = 300;

        banana.color = "green";
        banana.taste = "torsh";
        banana.priceInKg = 37000;
        banana.weight = 130;

        System.out.println("---------Apples changed----------");
        printAppleInformation(mango);
        System.out.println("-------");
        printAppleInformation(banana);


    }

    static void printAppleInformation(Fruit fruit) {
        System.out.println("color: " + fruit.color
                + "\ntaste: " + fruit.taste
                + "\nprice: " + fruit.priceInKg
                + "\nweight: " + fruit.weight);
    }
}
